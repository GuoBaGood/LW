package com.huxl.fam.config.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: GlobalExceptionHandler
 * 作者:huxl_oup
 * 日期:2019/2/14 13:57
 * 描述：统一异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler(HttpServletRequest req, Exception e){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", false);
        map.put("errMsg", e.getMessage());
        return map;
    }
}
