package com.huxl.fam.web;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.tool.PageResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: RepairController
 * 作者:huxl_oup
 * 日期:2019/4/16 13:29
 * 描述：关于资产维修；
 */
@Controller
@RequestMapping("/repair")
public class RepairController {

    /*
    * 查询维修中的资产：
    * */
    @ResponseBody
    @RequestMapping(value = "/repairing")
    public PageResponse queryRepairingAssets(HttpServletRequest request, PageBounds pageBounds){
        return null;
    }
}
