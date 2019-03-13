package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsBoreturnrecord implements Serializable{
    private static final long serialVersionUID = -6098649305504790925L;

    private String boreturnId;

    private String assetsId;

    private String assetsName;

    private Integer boreturnAmount;

    private String boreturnAccount;

    private String boreturnUserealname;

    private String boreturnTime;

    private String realReturntime;

    private Float actualIncome;

    private String managerAccount;

    private String managerName;

    private String remark;

    public String getBoreturnId() {
        return boreturnId;
    }

    public void setBoreturnId(String boreturnId) {
        this.boreturnId = boreturnId == null ? null : boreturnId.trim();
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

    public Integer getBoreturnAmount() {
        return boreturnAmount;
    }

    public void setBoreturnAmount(Integer boreturnAmount) {
        this.boreturnAmount = boreturnAmount;
    }

    public String getBoreturnAccount() {
        return boreturnAccount;
    }

    public void setBoreturnAccount(String boreturnAccount) {
        this.boreturnAccount = boreturnAccount == null ? null : boreturnAccount.trim();
    }

    public String getBoreturnUserealname() {
        return boreturnUserealname;
    }

    public void setBoreturnUserealname(String boreturnUserealname) {
        this.boreturnUserealname = boreturnUserealname == null ? null : boreturnUserealname.trim();
    }

    public String getBoreturnTime() {
        return boreturnTime;
    }

    public void setBoreturnTime(String boreturnTime) {
        this.boreturnTime = boreturnTime == null ? null : boreturnTime.trim();
    }

    public String getRealReturntime() {
        return realReturntime;
    }

    public void setRealReturntime(String realReturntime) {
        this.realReturntime = realReturntime == null ? null : realReturntime.trim();
    }

    public Float getActualIncome() {
        return actualIncome;
    }

    public void setActualIncome(Float actualIncome) {
        this.actualIncome = actualIncome;
    }

    public String getManagerAccount() {
        return managerAccount;
    }

    public void setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount == null ? null : managerAccount.trim();
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}