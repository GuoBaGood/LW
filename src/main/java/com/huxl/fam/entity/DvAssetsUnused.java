package com.huxl.fam.entity;

import java.io.Serializable;
import java.util.Date;

public class DvAssetsUnused implements Serializable{
    private static final long serialVersionUID = 3665199762923270619L;
    private String unusedId;

    private String assetsId;

    private String assetsName;

    private Date unusedTime;

    private String account;

    private String userName;

    private String remark;

    private String stayplace;

    public String getUnusedId() {
        return unusedId;
    }

    public void setUnusedId(String unusedId) {
        this.unusedId = unusedId == null ? null : unusedId.trim();
    }

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId == null ? null : assetsId.trim();
    }

    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName == null ? null : assetsName.trim();
    }

    public Date getUnusedTime() {
        return unusedTime;
    }

    public void setUnusedTime(Date unusedTime) {
        this.unusedTime = unusedTime;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStayplace() {
        return stayplace;
    }

    public void setStayplace(String stayplace) {
        this.stayplace = stayplace == null ? null : stayplace.trim();
    }
}