package com.huxl.fam.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: IdTool
 * 作者:huxl_oup
 * 日期:2019/4/17 15:16
 * 描述：生成一些表的主键
 */
public class IdTool {

    public static String DEPT_ID = "d"; //部门表
    public static String CMP_ID = "cmp"; //企业

    public static String deptId(String type){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        String id = "d" + sdf.format(date).replaceAll(":", "");//去掉所有空格
        return id;
    }
}
