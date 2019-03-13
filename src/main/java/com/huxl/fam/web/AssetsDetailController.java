package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsDetails;
import com.huxl.fam.service.AssetsDetailService;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    /**
     * 获取资产详情
     */
    @ResponseBody
    @RequestMapping(value = "/assetsDet")
    public PageResponse queryAssetsDetails(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        //条件查询
        List<DvAssetsDetails> detailsList = new ArrayList<>();
        try{
            detailsList = detailService.queryDatasBypage(new DvAssetsDetails(), pageBounds);
            int num = detailService.queryNumByCon(new DvAssetsDetails());
            res.setTotal(num);
        }catch (Exception e){
            e.printStackTrace();
        }

        res.setData(detailsList);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }
}
