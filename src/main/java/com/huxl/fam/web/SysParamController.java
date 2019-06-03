package com.huxl.fam.web;

import com.huxl.fam.entity.DvDept;
import com.huxl.fam.service.DeptService;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: SysParamController
 * 作者:huxl_oup
 * 日期:2019/4/30 9:00
 * 描述：系统参数设置
 */
@Controller
@RequestMapping("/sysParam")
public class SysParamController {
    @Autowired
    private DeptService deptService; //部门

    @ResponseBody
    @RequestMapping(value = "/queryDvDept")
    public PageResponse queryDvDept(HttpServletRequest request){
        PageResponse res = new PageResponse();
        List<DvDept> depts = deptService.queryDepts();
        res.setTotal(depts.size());
        res.setData(depts);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }
}
