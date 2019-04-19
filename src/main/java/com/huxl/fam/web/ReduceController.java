package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsReduce;
import com.huxl.fam.service.AssetsReduceService;
import com.huxl.fam.tool.LogUtil;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ReduceController
 * 作者:huxl_oup
 * 日期:2019/4/19 15:02
 * 描述：报废资产
 */
@Controller
@RequestMapping("/reduce")
public class ReduceController {

    @Autowired
    private AssetsReduceService reduceService;

    @ResponseBody
    @RequestMapping(value = "/record")
    public PageResponse queryAssetsDetails(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();

        //前端传递回来的数据


        DvAssetsReduce d = new DvAssetsReduce();
        List<DvAssetsReduce> list = reduceService.queryReduce(d, pageBounds);
        int num = reduceService.queryNum(d);
        LogUtil.ADDLOG(request, "查询报废资产记录");
        res.setTotal(num);
        res.setData(list);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功");
        return res;
    }
}
