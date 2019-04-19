package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsRepair;
import com.huxl.fam.service.RepairService;
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
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: RepairController
 * 作者:huxl_oup
 * 日期:2019/4/16 13:29
 * 描述：关于资产维修；
 */
@Controller
@RequestMapping("/repair")
public class RepairController {

    @Autowired
    private RepairService repairService;

    /*
    * 查询维修中和维修完成的资产：
    * */
    @ResponseBody
    @RequestMapping(value = "/aboutrepair/{type}",method = RequestMethod.GET)
    public PageResponse queryRepairingAssets(HttpServletRequest request, @PathVariable(value = "type") String type, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        //条件
        DvAssetsRepair d = new DvAssetsRepair();
        d.setAssetsId(request.getParameter("aId"));
        d.setAssetsName(request.getParameter("aName"));
        String sendtime = request.getParameter("sendtime");
        String desc = "";
        if (type.equals("repairing")){
            d.setRepairStyle("0");
            desc = "查询维修中的资产";
        }
        if (type.equals("repaired")){
            d.setRepairStyle("1"); //维修完成
            desc = "查询资产维修记录";
        }
        d.setRepairTime(ComUtil.StingToDate(sendtime));
        List<DvAssetsRepair> list = repairService.queryRepairingAssets(d, pageBounds);
        int num = repairService.queryRepairingAssetsNum(d);
        LogUtil.ADDLOG(request, desc);
        res.setTotal(num);
        res.setData(list);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }


    /**
     * 维修记录
     * */
}
