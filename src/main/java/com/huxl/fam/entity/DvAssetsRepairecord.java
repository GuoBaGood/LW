package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsRepairecord implements Serializable{
    private static final long serialVersionUID = 8156024645367040788L;

    private String repairecordId;

    private String assetsId;

    private String assetsName;

    private Integer assetsNum;

    private String repairTime;

    private String completeRepairtime;

    private String repairPrice;

    private String repairCompany;

    private String repairCompanyphone;

    private String repairSituation;

    private String malfunctionReson;

    private String account;

    private String userName;

    private String remark;

    public String getRepairecordId() {
        return repairecordId;
    }

    public void setRepairecordId(String repairecordId) {
        this.repairecordId = repairecordId == null ? null : repairecordId.trim();
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

    public Integer getAssetsNum() {
        return assetsNum;
    }

    public void setAssetsNum(Integer assetsNum) {
        this.assetsNum = assetsNum;
    }

    public String getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(String repairTime) {
        this.repairTime = repairTime == null ? null : repairTime.trim();
    }

    public String getCompleteRepairtime() {
        return completeRepairtime;
    }

    public void setCompleteRepairtime(String completeRepairtime) {
        this.completeRepairtime = completeRepairtime == null ? null : completeRepairtime.trim();
    }

    public String getRepairPrice() {
        return repairPrice;
    }

    public void setRepairPrice(String repairPrice) {
        this.repairPrice = repairPrice == null ? null : repairPrice.trim();
    }

    public String getRepairCompany() {
        return repairCompany;
    }

    public void setRepairCompany(String repairCompany) {
        this.repairCompany = repairCompany == null ? null : repairCompany.trim();
    }

    public String getRepairCompanyphone() {
        return repairCompanyphone;
    }

    public void setRepairCompanyphone(String repairCompanyphone) {
        this.repairCompanyphone = repairCompanyphone == null ? null : repairCompanyphone.trim();
    }

    public String getRepairSituation() {
        return repairSituation;
    }

    public void setRepairSituation(String repairSituation) {
        this.repairSituation = repairSituation == null ? null : repairSituation.trim();
    }

    public String getMalfunctionReson() {
        return malfunctionReson;
    }

    public void setMalfunctionReson(String malfunctionReson) {
        this.malfunctionReson = malfunctionReson == null ? null : malfunctionReson.trim();
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
}