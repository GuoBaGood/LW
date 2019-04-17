package com.huxl.fam.entity;

import java.io.Serializable;
import java.util.Date;

public class DvAssetsDetails implements Serializable {
    private static final long serialVersionUID = -5041279993688064920L;
    private String assetsId;

    private String assetsName;

    private String assetsNormtype;

    private String assetsFactory;

    private Date assetsBuytime;

    private Integer assetsNum;

    private Float assetsUnivalent;

    private Float assetsAllAmount;

    private Float assetInitialval;

    private String assetsAddway;

    private String assetsStateId;

    private String assetsStateName;

    private Date assetsOutfactoryTime;

    private String depWay;

    private Integer depMonthnum;

    private String assetsRemark;

    private Integer carryMonthnum;

    private Float depMothly;

    private Float exceptNetval;

    private Float depAll;

    private String useName;

    private String assetsType;

    private String storageLocation;

    private Date useTime;

    private String useAccountype;

    private String useId;

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

    public Date getAssetsBuytime() {
        return assetsBuytime;
    }

    public void setAssetsBuytime(Date assetsBuytime) {
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

    public String getAssetsRemark() {
        return assetsRemark;
    }

    public void setAssetsRemark(String assetsRemark) {
        this.assetsRemark = assetsRemark == null ? null : assetsRemark.trim();
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

    public String getDeptUse() {
        return useName;
    }

    public void setDeptUse(String useName) {
        this.useName = useName == null ? null : useName.trim();
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType == null ? null : assetsType.trim();
    }

    public String getStorageLocation() {
        return storageLocation;
    }

    public void setStorageLocation(String storageLocation) {
        this.storageLocation = storageLocation == null ? null : storageLocation.trim();
    }

    public Date getUseTime() {
        return useTime;
    }

    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    public String getUseAccountype() {
        return useAccountype;
    }

    public void setUseAccountype(String useAccountype) {
        this.useAccountype = useAccountype == null ? null : useAccountype.trim();;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }


}