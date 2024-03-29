package com.huxl.fam.tool;

import com.huxl.fam.entity.DvUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ComUtil
 * 作者:huxl_oup
 * 日期:2019/4/17 15:16
 * 描述：生成一些表的主键
 */
public class ComUtil {

    public static String DEPT_ID = "d"; //部门表
    public static String CMP_ID = "cmp"; //企业
    public static String UNUSED_ID = "un"; //闲置资产
    public static String ASSETS_ID = "GD"; //资产id
    public static String BORETURN_ID = "bt"; //租借资产
    public static String LOG_ID = "lg"; //日志

    //生产id
    public static String deptId(String type){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss");
        String id = type + sdf.format(date).replaceAll(":", "")+(int)(Math.random()*100);//去掉所有空格
        return id;
    }

    //时间转换
    public static Date StingToDate(String time){
        if (time != null && time != ""){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                return sdf.parse(time);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }else {
            return null;
        }
    }

    public static Integer StringToInt(String str){
        if (str != null && str != ""){
            try{
                return Integer.parseInt(str);
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }else {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            return year;
        }
    }
    //获取当前登陆者信息
    public  static DvUser UserDatas(HttpServletRequest request){
        DvUser u = (DvUser) request.getSession().getAttribute("user");
        return u;
    }

    //清除session中的值
    public static void DELET_SESSION(HttpServletRequest request){
        HttpSession session = request.getSession(true);
        session.removeAttribute("user");
    }
}
