package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAllDepreciation implements Serializable{
    private static final long serialVersionUID = -8709560688732727801L;

    private String depId;

    private String assetsId;

    private String assetsName;

    private String depWay;

    private Float depPricebymon;

    private Integer depYear;

    private Integer depMonth;

    private String remark;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
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

    public String getDepWay() {
        return depWay;
    }

    public void setDepWay(String depWay) {
        this.depWay = depWay == null ? null : depWay.trim();
    }

    public Float getDepPricebymon() {
        return depPricebymon;
    }

    public void setDepPricebymon(Float depPricebymon) {
        this.depPricebymon = depPricebymon;
    }

    public Integer getDepYear() {
        return depYear;
    }

    public void setDepYear(Integer depYear) {
        this.depYear = depYear;
    }

    public Integer getDepMonth() {
        return depMonth;
    }

    public void setDepMonth(Integer depMonth) {
        this.depMonth = depMonth;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}