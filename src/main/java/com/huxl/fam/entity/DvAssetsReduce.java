package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsReduce implements Serializable {
    private static final long serialVersionUID = 1824633927847408858L;
    private String reduceId;

    private String assetsId;

    private String assetsName;

    private String reduceNum;

    private String reduceTime;

    private String reduceWay;

    private String reduceReason;

    private String cleaningIncome;

    private String cleaningOutlay;

    private String account;

    private String userName;

    private String remark;

    public String getReduceId() {
        return reduceId;
    }

    public void setReduceId(String reduceId) {
        this.reduceId = reduceId == null ? null : reduceId.trim();
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

    public String getReduceNum() {
        return reduceNum;
    }

    public void setReduceNum(String reduceNum) {
        this.reduceNum = reduceNum == null ? null : reduceNum.trim();
    }

    public String getReduceTime() {
        return reduceTime;
    }

    public void setReduceTime(String reduceTime) {
        this.reduceTime = reduceTime == null ? null : reduceTime.trim();
    }

    public String getReduceWay() {
        return reduceWay;
    }

    public void setReduceWay(String reduceWay) {
        this.reduceWay = reduceWay == null ? null : reduceWay.trim();
    }

    public String getReduceReason() {
        return reduceReason;
    }

    public void setReduceReason(String reduceReason) {
        this.reduceReason = reduceReason == null ? null : reduceReason.trim();
    }

    public String getCleaningIncome() {
        return cleaningIncome;
    }

    public void setCleaningIncome(String cleaningIncome) {
        this.cleaningIncome = cleaningIncome == null ? null : cleaningIncome.trim();
    }

    public String getCleaningOutlay() {
        return cleaningOutlay;
    }

    public void setCleaningOutlay(String cleaningOutlay) {
        this.cleaningOutlay = cleaningOutlay == null ? null : cleaningOutlay.trim();
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