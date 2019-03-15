package com.huxl.fam.entity;

import java.io.Serializable;
import java.util.Date;

public class DvAssetsDetails implements Serializable{
    private static final long serialVersionUID = -6159833200493106480L;


    private String assetsId;

    private String assetsName;

    private String assetsNormtype;

    private String assetsFactory;

    private Date assetsBuytime;

    private Integer assetsNum;

    private Float assetsUnivalent; //单价

    private Float assetsAllAmount; //资产总额

    private Float assetInitialval; //资产原值

    private String assetsAddway; //购买方式

    private String assetsStateId; //状态id

    private String assetsStateName; //状态

    private Date assetsOutfactoryTime; //出厂时间

    private String depWay; //折旧方式

    private Integer depMonthnum; //折旧月数

    private Integer carryMonthnum; //以提月数

    private Float depMothly; //月度折旧额

    private Float exceptNetval;//预计残净值

    private Float depAll; //累计折旧

    private String storageLocation; //存储地

    private String deptUse; //使用部门

    private String assetsType; //资产类型

    private String assetsRemark; //说明

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

    public String getAssetsNormtype() {
        return assetsNormtype;
    }

    public void setAssetsNormtype(String assetsNormtype) {
        this.assetsNormtype = assetsNormtype == null ? null : assetsNormtype.trim();
    }

    public String getAssetsFactory() {
        return assetsFactory;
    }

    public void setAssetsFactory(String assetsFactory) {
        this.assetsFactory = assetsFactory == null ? null : assetsFactory.trim();
    }

    public Date getassetsBuytime() {
        return assetsBuytime;
    }

    public void setassetsBuytime(Date assetsBuytime) {
        this.assetsBuytime = assetsBuytime;
    }

    public Integer getAssetsNum() {
        return assetsNum;
    }

    public void setAssetsNum(Integer assetsNum) {
        this.assetsNum = assetsNum;
    }

    public Float getAssetsUnivalent() {
        return assetsUnivalent;
    }

    public void setAssetsUnivalent(Float assetsUnivalent) {
        this.assetsUnivalent = assetsUnivalent;
    }

    public Float getAssetsAllAmount() {
        return assetsAllAmount;
    }

    public void setAssetsAllAmount(Float assetsAllAmount) {
        this.assetsAllAmount = assetsAllAmount;
    }

    public Float getAssetInitialval() {
        return assetInitialval;
    }

    public void setAssetInitialval(Float assetInitialval) {
        this.assetInitialval = assetInitialval;
    }

    public String getAssetsAddway() {
        return assetsAddway;
    }

    public void setAssetsAddway(String assetsAddway) {
        this.assetsAddway = assetsAddway == null ? null : assetsAddway.trim();
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

    public Date getAssetsOutfactoryTime() {
        return assetsOutfactoryTime;
    }

    public void setAssetsOutfactoryTime(Date assetsOutfactoryTime) {
        this.assetsOutfactoryTime = assetsOutfactoryTime;
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

    public Integer getCarryMonthnum() {
        return carryMonthnum;
    }

    public void setCarryMonthnum(Integer carryMonthnum) {
        this.carryMonthnum = carryMonthnum;
    }

    public Float getDepMothly() {
        return depMothly;
    }

    public void setDepMothly(Float depMothly) {
        this.depMothly = depMothly;
    }

    public Float getExceptNetval() {
        return exceptNetval;
    }

    public void setExceptNetval(Float exceptNetval) {
        this.exceptNetval = exceptNetval;
    }

    public Float getDepAll() {
        return depAll;
    }

    public void setDepAll(Float depAll) {
        this.depAll = depAll;
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public String getDeptUse() {
        return deptUse;
    }

    public void setDeptUse(String deptUse) {
        this.deptUse = deptUse == null ? null : deptUse.trim();
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType == null ? null : assetsType.trim();
    }

    public String getAssetsRemark() {
        return assetsRemark;
    }

    public void setAssetsRemark(String assetsRemark) {
        this.assetsRemark = assetsRemark == null ? null : assetsRemark.trim();
    }
}