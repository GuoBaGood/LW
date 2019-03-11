package com.huxl.fam.config.adapter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: MvcConfigure
 * 作者:huxl_oup
 * 日期:2019/3/10 21:15
 * 描述：拦截器的相关配置:springboot访问静态资源
 */

@Configuration
public class MvcConfigure implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 将/static/**访问映射到classpath:/mystatic/
        //registry.addResourceHandler("/static/**").addResourceLocations("classpath:/mystatic/");
    }
}
