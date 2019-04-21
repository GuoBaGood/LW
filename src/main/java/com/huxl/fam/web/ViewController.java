package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.service.ViewService;
import com.huxl.fam.tool.PageResponse;
import com.huxl.fam.vo.BarVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ViewController
 * 作者:huxl_oup
 * 日期:2019/4/21 15:22
 * 描述：数据可视化的作用
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private ViewService viewService;

    /*
    * 柱状图
    * */
    @ResponseBody
    @RequestMapping(value = "/manyBar")
    public List<BarVo> view(HttpServletRequest request){
        List<BarVo> list = viewService.queryByDate();
        return list;
    }
}

