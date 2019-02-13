package com.huxl.fam.entity;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BsUser
 * 作者:huxl_oup
 * 日期:2019/2/13 13:29
 * 描述：用户登录表
 */
public class BsUser {
    private String uId;

    private String uName;

    private String uPassword;

    private String uPower;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public String getuPower() {
        return uPower;
    }

    public void setuPower(String uPower) {
        this.uPower = uPower;
    }
}
