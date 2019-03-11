package com.huxl.fam.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: LoginController
 * 作者:huxl_oup
 * 日期:2019/2/14 14:16
 * 描述：测试页面的访问
 */
@Controller
public class LoginController {

    @ResponseBody  //加上该标签返回的是一个“login”的字符串；
    @RequestMapping(value = "/fam")
    public ModelAndView index(HttpServletRequest request, ModelAndView view){
        HttpSession session = request.getSession();
        session.invalidate();
        view.setViewName("login");
        return view;
    }


    @ResponseBody
    @RequestMapping(value = "loginMain", method=POST)
    public ModelAndView login(HttpServletRequest request, ModelAndView view){
        HttpSession session = request.getSession();
        session.invalidate();
        String name = request.getParameter("loginUser");
        String pwd = request.getParameter("loginPwd");
        view.setViewName("loginMain");
        return view;
    }

}
