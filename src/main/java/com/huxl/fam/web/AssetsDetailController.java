package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.*;
import com.huxl.fam.service.*;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

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
        if (buytime != null && buytime != ""){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                d.setAssetsBuytime(sdf.parse(buytime));
            } catch (ParseException e) {
                e.printStackTrace();
                d.setAssetsBuytime(null);
            }
        }
        //条件查询
        List<DvAssetsDetails> detailsList = new ArrayList<>();
        try{
            detailsList = detailService.queryDatasBypage(d, pageBounds);
            int num = detailService.queryNumByCon(d);
            res.setTotal(num);
        }catch (Exception e){
            e.printStackTrace();
        }

        res.setData(detailsList);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
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
        if ("cmp" == type){ //新增企业

        }
        if ("dept" == type){ //新增部门
//            List<DvDept> depts = JSON.parseArray(str, PprtDvTplArea.class);
        }
        return "hallo";
    }

}
