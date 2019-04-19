package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvLog;
import com.huxl.fam.service.LogService;
import com.huxl.fam.tool.ComUtil;
import com.huxl.fam.tool.LogUtil;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: LogController
 * 作者:huxl_oup
 * 日期:2019/4/19 22:41
 * 描述：日志管理
 */

@Controller
@RequestMapping("/log")
public class LogController {

    @Autowired
    private LogService logService;
    /*
    * 日志记录
    * */
    @ResponseBody
    @RequestMapping(value = "/aboutlog")
    public PageResponse queryAssetsDetails(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        DvLog log = new DvLog();
        //前端传来的参数
        log.setAccount(request.getParameter("account"));
        log.setLogDesc(request.getParameter("logDesc"));
        log.setManageTime(ComUtil.StingToDate(request.getParameter("manageTime")));
        List<DvLog> list = logService.queryLogRecord(log, pageBounds);
        int num = logService.queryNum(log);
        LogUtil.ADDLOG(request, "查询日志记录");
        res.setTotal(num);
        res.setData(list);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }
}
