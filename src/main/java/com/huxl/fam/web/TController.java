package com.huxl.fam.web;

import com.huxl.fam.entity.BsUser;
import com.huxl.fam.service.BsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: TController
 * 作者:huxl_oup
 * 日期:2019/2/13 11:39
 * 描述：测试类
 */

@RestController
@RequestMapping("/text")
public class TController {
    @Autowired
    private BsUserService bsUserService;
    @RequestMapping(value = "/hallo",method = RequestMethod.GET)
    public String a(){
        return "hallo,world!";
    }


    @RequestMapping(value = "/abc")
    public List<BsUser> aa(){
        BsUser b = bsUserService.selectByPrimaryKey("1");
        List<BsUser> list = new ArrayList<BsUser>();
        list.add(b);
        return list;
    }
}
