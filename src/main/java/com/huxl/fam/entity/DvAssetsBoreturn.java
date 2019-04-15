package com.huxl.fam.entity;

import java.io.Serializable;
import java.util.Date;

public class DvAssetsBoreturn implements Serializable {
    private static final long serialVersionUID = -2688842133960219658L;
    private String boreturnId;

    private String assetsId;

    private String assetsName;

    private String boreturnAccount;

    private String boreturnUserealname;

    private Date boreturnTime;

    private Date prescriptReturntime;

    private Float prescriptIncome;

    private String managerAccount;

    private Date realReturntime;

    private Float realIncome;

    private String managerName;

    private String assetsStateId;

    private String assetsStateName;

    private String remark;

    private String boreturnStyle;

    private String userType;

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

    public Date getBoreturnTime() {
        return boreturnTime;
    }

    public void setBoreturnTime(Date boreturnTime) {
        this.boreturnTime = boreturnTime;
    }

    public Date getPrescriptReturntime() {
        return prescriptReturntime;
    }

    public void setPrescriptReturntime(Date prescriptReturntime) {
        this.prescriptReturntime = prescriptReturntime;
    }

    public Float getPrescriptIncome() {
        return prescriptIncome;
    }

    public void setPrescriptIncome(Float prescriptIncome) {
        this.prescriptIncome = prescriptIncome;
    }

    public String getManagerAccount() {
        return managerAccount;
    }

    public void setManagerAccount(String managerAccount) {
        this.managerAccount = managerAccount == null ? null : managerAccount.trim();
    }

    public Date getRealReturntime() {
        return realReturntime;
    }

    public void setRealReturntime(Date realReturntime) {
        this.realReturntime = realReturntime;
    }

    public Float getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(Float realIncome) {
        this.realIncome = realIncome;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getAssetsStateId() {
        return assetsStateId;
    }

    public void setAssetsStateId(String assetsStateId) {
        this.assetsStateId = assetsStateId == null ? null : assetsStateId.trim();
    }

    public String getAssetsStateName() {
        return assetsStateName;
    }

    public void setAssetsStateName(String assetsStateName) {
        this.assetsStateName = assetsStateName == null ? null : assetsStateName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBoreturnStyle() {
        return boreturnStyle;
    }

    public void setBoreturnStyle(String boreturnStyle) {
        this.boreturnStyle = boreturnStyle == null ? null : boreturnStyle.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}