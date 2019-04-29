package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvUser;
import com.huxl.fam.service.UserService;
import com.huxl.fam.tool.ComUtil;
import com.huxl.fam.tool.LogUtil;
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

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: PersonController
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private UserService userService;

    //查询页面数据
    @ResponseBody
    @RequestMapping("/personDat")
    public PageResponse personDat(HttpServletRequest request, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        String userP = request.getParameter("userRealname");
        DvUser user = new DvUser();
        user.setUserRealname(userP);
        List<DvUser>  dataList = new ArrayList<>();
        try{
            dataList = userService.personDat(user,pageBounds);
            int num = userService.queryNumByCon();

            res.setData(dataList);
            res.setResponseCode(200);
            res.setResponseDesc("查询成功！");
        }catch (Exception e){
            res.setResponseCode(201);
            res.setResponseDesc("查询失败！");
        }finally {
            return res;
        }

    }

    //删除用户
    @ResponseBody
    @RequestMapping("/personDelete")
    public String personDelete(  DvUser user ){
        String rStr = "no";
     try{
         if(!(user.getUserId()==null||user.getUserId().equals(""))) {
             userService.personDelete(user);
             rStr = "ok";
         }
     }catch (Exception e ){}
        return rStr;
    }

    //个人获取个人信息
    @ResponseBody
    @RequestMapping("/findPerson")
    public DvUser findPerson(HttpServletRequest request){
       return ComUtil.UserDatas(request);
    }
}
