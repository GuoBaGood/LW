package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsBoreturn;
import com.huxl.fam.service.BoreturnService;
import com.huxl.fam.tool.PageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BoreturnController
 * 作者:huxl_oup
 * 日期:2019/4/18 11:14
 * 描述：租借信息
 */
@Controller
@RequestMapping("/boreturn")
public class BoreturnController {

    @Autowired
    private BoreturnService boreturnService;

    @ResponseBody
    @RequestMapping(value = "/aboutboreturn/{type}",method = RequestMethod.GET)
    public PageResponse queryAssetsDetails(HttpServletRequest request, @PathVariable(value = "type") String type, PageBounds pageBounds){
        PageResponse res = new PageResponse();
        //获取前端传回的数据
        DvAssetsBoreturn b = new DvAssetsBoreturn();
        if (type.equals("borrow")){ //租借中
            b.setBoreturnStyle("0");
        }
        if (type.equals("return")){//租借完成，已经归还；
            b.setBoreturnStyle("1");
        }
        b.setAssetsId(request.getParameter("assetsId"));
        b.setAssetsName(request.getParameter("assetsName"));
        b.setBoreturnUserealname(request.getParameter("boreturnUserealname"));
        String boreturnTime = request.getParameter("boreturnTime");
        if (boreturnTime !=null || boreturnTime != ""){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                b.setBoreturnTime(sdf.parse(boreturnTime));
            } catch (ParseException e) {
                e.printStackTrace();
                b.setBoreturnTime(null);
            }
        }
        List<DvAssetsBoreturn> list = boreturnService.selectBoreturn(b, pageBounds);
        int num = boreturnService.queryNum(b);
        res.setTotal(num);
        res.setData(list);
        res.setResponseCode(200);
        res.setResponseDesc("操作成功！");
        return res;
    }
}