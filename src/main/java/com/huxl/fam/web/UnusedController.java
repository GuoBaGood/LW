package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsUnused;
import com.huxl.fam.service.UnusedService;
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
 * 文件名: UnusedController
 * 作者:huxl_oup
 * 日期:2019/4/18 22:25
 * 描述：闲置状态
 */

@Controller
@RequestMapping("/unused")
public class UnusedController {
    @Autowired
    private UnusedService unusedService;

    @ResponseBody
    @RequestMapping(value = "/aboutUnused")
    public PageResponse aboutUnused(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        //获取前端传过来的数据；

        DvAssetsUnused d = new DvAssetsUnused();
        List<DvAssetsUnused> list = unusedService.queryUnusedByPage(d, pageBounds);
        int num = unusedService.queryNum();
        LogUtil.ADDLOG(request, "查询闲置资产");
        res.setResponseDesc("操作成功");
        res.setData(list);
        res.setTotal(num);
        res.setResponseCode(200);
        return res;
    }
}
