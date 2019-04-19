package com.huxl.fam.web;

import com.alibaba.fastjson.JSON;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.*;
import com.huxl.fam.service.*;
import com.huxl.fam.tool.ComUtil;
import com.huxl.fam.tool.LogUtil;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;




/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsDetailController
 * 作者:huxl_oup
 * 日期:2019/3/13 13:47
 * 描述：处理资产细节
 */

@Controller
@RequestMapping("/details")
public class AssetsDetailController {

    @Autowired
    private AssetsDetailService detailService;

    @Autowired
    private AssetsTypeService typeService;

    @Autowired
    private StateService stateService;

    @Autowired
    private DeptService deptService; //部门

    @Autowired
    private BorrowCmpService borrowCmpService; //租借企业信息；
    /**
     * 获取资产详情
     */
    @ResponseBody
    @RequestMapping(value = "/assetsDet")
    public PageResponse queryAssetsDetails(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        //获取搜索条件：
        String assetsId = request.getParameter("aId");
        String assetsName = request.getParameter("aName");
        String atype = request.getParameter("atype");
        String astate = request.getParameter("astate");
        String buytime = request.getParameter("buytime");
        DvAssetsDetails d = new DvAssetsDetails();
        d.setAssetsId(assetsId);
        d.setAssetsName(assetsName);
        d.setAssetsType(atype);
        d.setAssetsStateId(astate);
        d.setAssetsBuytime(ComUtil.StingToDate(buytime));
        //条件查询
        List<DvAssetsDetails> detailsList = new ArrayList<>();
        try{
            detailsList = detailService.queryDatasBypage(d, pageBounds);
            int num = detailService.queryNumByCon(d);
            res.setTotal(num);
        }catch (Exception e){
            e.printStackTrace();
        }
        LogUtil.ADDLOG(request, "查找资产详情列表");
        res.setData(detailsList);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }


    /*
    * 新建资产订单
    * **/
    @ResponseBody
    @RequestMapping(value = "/addNewDetails")
    public String addNewDetails(HttpServletRequest request){
        String str = request.getParameter("datas");
        List<DvAssetsDetails> details = JSON.parseArray(str, DvAssetsDetails.class);
        DvAssetsDetails d = details.get(0);
        d.setAssetsId(ComUtil.deptId(ComUtil.ASSETS_ID));
        DvAssetsUnused u = new DvAssetsUnused();
        DvAssetsBoreturn bt = new DvAssetsBoreturn();
        String type = "";
        if (d.getUseAccountype().equals("")){ //闲置资产
            u.setUnusedId(ComUtil.deptId(ComUtil.UNUSED_ID));
            u.setAssetsId(d.getAssetsId());
            u.setAssetsName(d.getAssetsName());
            u.setUnusedTime(d.getAssetsBuytime());
            u.setAccount(ComUtil.UserDatas(request).getAccount());
            u.setUserName(ComUtil.UserDatas(request).getUserRealname());
            u.setRemark(d.getAssetsRemark());
            u.setStayplace(d.getStorageLocation());
            type = "unused";
        }else { //租借
            if (d.getUseAccountype().equals("0")) { //企业内部租用
                bt.setUserType("0");
            }

            if (d.getUseAccountype().equals("1")){ //对外租用
                bt.setPrescriptIncome(d.getPrescriptIncome());
                bt.setUserType("1");
            }
            bt.setBoreturnId(ComUtil.deptId(ComUtil.BORETURN_ID));
            bt.setAssetsId(d.getAssetsId());
            bt.setAssetsName(d.getAssetsName());
            bt.setBoreturnAccount(d.getUseId());
            bt.setBoreturnUserealname("");
            bt.setPrescriptReturntime(d.getPrescriptReturntime());
            bt.setManagerAccount(ComUtil.UserDatas(request).getAccount());
            bt.setManagerName(ComUtil.UserDatas(request).getUserRealname());
            bt.setAssetsStateId("2");
            bt.setAssetsStateName("已借出");
            bt.setRemark(d.getAssetsRemark());
            bt.setBoreturnStyle("0");
            type = "boreturn";
        }
        Map map = new HashMap();
        map.put("assets", d);
        map.put("unused", u);
        map.put("boreturn", bt);
        map.put("type", type);
        String s = detailService.insertMore(map);
        LogUtil.ADDLOG(request, "新增资产");
        return "success";
    }

    /**
     * 查询使用情况、类别的信息、部门信息、企业信息；
     */
    @ResponseBody
    @RequestMapping(value = "/queryStateAndType")
    public Map queryStateAndType(HttpServletRequest request){
        Map map = new HashMap();
        List<DvAssetsType> types = typeService.queryAllTyep();
        List<DvState> states = stateService.queryAllState();
        List<DvDept> depts = deptService.queryDepts();
        List<DvBorrowCmp> borrowCmps = borrowCmpService.queryCmp();
        LogUtil.ADDLOG(request, "查询资产状态/部门/租借企业/资产类型信息");
        map.put("types", types);
        map.put("states", states);
        map.put("depts", depts);
        map.put("borrowCmps", borrowCmps);
        return map;
    }

    /**
     * 增加部门or 企业信息
     * */
    @ResponseBody
    @RequestMapping(value = "/addDeptOrCmp/{type}",method = RequestMethod.GET)
    public String addDeptOrCmp(HttpServletRequest request,@PathVariable(value = "type") String type){
        String str = request.getParameter("datas");
        String data = "";
        if (type.equals("cmp")){ //新增企业
            DvBorrowCmp cmp = JSON.parseArray(str, DvBorrowCmp.class).get(0);
            cmp.setCmpId(ComUtil.deptId(ComUtil.CMP_ID));
            try{
                data = borrowCmpService.insertSelective(cmp);
            }catch (Exception e){
                e.printStackTrace();
            }
            LogUtil.ADDLOG(request, "新增企业信息");
        }
        if (type.equals("dept")){ //新增部门
           DvDept dept = JSON.parseArray(str, DvDept.class).get(0);
           dept.setDeptId(ComUtil.deptId(ComUtil.DEPT_ID));
           try{
               data = deptService.insertSelective(dept);
           }catch (Exception e){
               e.printStackTrace();
           }
            LogUtil.ADDLOG(request, "新增部门信息");
        }

        return data;
    }

}
