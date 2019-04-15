package com.huxl.fam.entity;

import java.io.Serializable;

public class DvDepAccounting implements Serializable {
    private static final long serialVersionUID = -5478770422026611594L;
    private String depId;

    private String deptId;

    private String typeId;

    private String assetsId;

    private String assetsName;

    private Float assetsOrigvalue;

    private Float allDep;

    private String depWay;

    private Integer depMonthnum;

    private Integer raisedMonthnum;

    private Float monthReprice;

    private Float expectResidualval;

    private Float residualValue;

    private Integer depMonth;

    private Integer depYear;

    private String remark;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId == null ? null : depId.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
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

    public Float getAssetsOrigvalue() {
        return assetsOrigvalue;
    }

    public void setAssetsOrigvalue(Float assetsOrigvalue) {
        this.assetsOrigvalue = assetsOrigvalue;
    }

    public Float getAllDep() {
        return allDep;
    }

    public void setAllDep(Float allDep) {
        this.allDep = allDep;
    }

    public String getDepWay() {
        return depWay;
    }

    public void setDepWay(String depWay) {
        this.depWay = depWay == null ? null : depWay.trim();
    }

    public Integer getDepMonthnum() {
        return depMonthnum;
    }

    public void setDepMonthnum(Integer depMonthnum) {
        this.depMonthnum = depMonthnum;
    }

    public Integer getRaisedMonthnum() {
        return raisedMonthnum;
    }

    public void setRaisedMonthnum(Integer raisedMonthnum) {
        this.raisedMonthnum = raisedMonthnum;
    }

    public Float getMonthReprice() {
        return monthReprice;
    }

    public void setMonthReprice(Float monthReprice) {
        this.monthReprice = monthReprice;
    }

    public Float getExpectResidualval() {
        return expectResidualval;
    }

    public void setExpectResidualval(Float expectResidualval) {
        this.expectResidualval = expectResidualval;
    }

    public Float getResidualValue() {
        return residualValue;
    }

    public void setResidualValue(Float residualValue) {
        this.residualValue = residualValue;
    }

    public Integer getDepMonth() {
        return depMonth;
    }

    public void setDepMonth(Integer depMonth) {
        this.depMonth = depMonth;
    }

    public Integer getDepYear() {
        return depYear;
    }

    public void setDepYear(Integer depYear) {
        this.depYear = depYear;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}