package com.huxl.fam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: TController
 * 作者:huxl_oup
 * 日期:2019/2/13 11:39
 * 描述：测试类
 */

@RestController
public class TController {
    @RequestMapping(value = "/hallo",method = RequestMethod.GET)
    public String a(){
        return "hallo,world!";
    }
}
