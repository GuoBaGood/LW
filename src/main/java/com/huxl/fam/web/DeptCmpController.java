package com.huxl.fam.web;

import com.huxl.fam.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: DeptController
 * 作者:huxl_oup
 * 日期:2019/4/17 12:35
 * 描述：部门信息、租借企业的信息；
 */
@Controller
@RequestMapping("/dept")
public class DeptCmpController {
    @Autowired
    private DeptService deptService;


}
