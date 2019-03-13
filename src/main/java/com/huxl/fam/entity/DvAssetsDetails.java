package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsDetails implements Serializable{
    private static final long serialVersionUID = -6159833200493106480L;


    private String assetsId;

    private String assetsName;

    private String assetsNormtype;

    private String assetsFactory;

    private String assetsBuytiem;

    private Integer assetsNum;

    private Float assetsUnivalent;

    private Float assetsAllAmount;

    private Float assetInitialval;

    private String assetsAddway;

    private String assetsStateId;

    private String assetsStateName;

    private String assetsOutfactoryTime;

    private String depWay;

    private Integer depMonthnum;

    private Integer carryMonthnum;

    private Float depMothly;

    private Float exceptNetval;

    private Float depAll;

    private String storageLocation;

    private String deptUse;

    private String assetsType;

    private String assetsRemark;

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

    public String getAssetsBuytiem() {
        return assetsBuytiem;
    }

    public void setAssetsBuytiem(String assetsBuytiem) {
        this.assetsBuytiem = assetsBuytiem == null ? null : assetsBuytiem.trim();
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

    public String getAssetsOutfactoryTime() {
        return assetsOutfactoryTime;
    }

    public void setAssetsOutfactoryTime(String assetsOutfactoryTime) {
        this.assetsOutfactoryTime = assetsOutfactoryTime == null ? null : assetsOutfactoryTime.trim();
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