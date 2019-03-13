package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsRepair implements Serializable{
    private static final long serialVersionUID = -6300432115466035497L;

    private String repairId;

    private String assetsId;

    private String assetsName;

    private String assetsNum;

    private String repairTime;

    private String estimatedCompletionTime;

    private String estimatedRepairPrice;

    private String repairCompany;

    private String repairCompanyphone;

    private String repairSituation;

    private String malfunctionReson;

    private String account;

    private String userName;

    private String remark;

    public String getRepairId() {
        return repairId;
    }

    public void setRepairId(String repairId) {
        this.repairId = repairId == null ? null : repairId.trim();
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

    public String getAssetsNum() {
        return assetsNum;
    }

    public void setAssetsNum(String assetsNum) {
        this.assetsNum = assetsNum == null ? null : assetsNum.trim();
    }

    public String getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(String repairTime) {
        this.repairTime = repairTime == null ? null : repairTime.trim();
    }

    public String getEstimatedCompletionTime() {
        return estimatedCompletionTime;
    }

    public void setEstimatedCompletionTime(String estimatedCompletionTime) {
        this.estimatedCompletionTime = estimatedCompletionTime == null ? null : estimatedCompletionTime.trim();
    }

    public String getEstimatedRepairPrice() {
        return estimatedRepairPrice;
    }

    public void setEstimatedRepairPrice(String estimatedRepairPrice) {
        this.estimatedRepairPrice = estimatedRepairPrice == null ? null : estimatedRepairPrice.trim();
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