package com.huxl.fam.entity;

import java.io.Serializable;

public class DvAssetsType implements Serializable {
    private static final long serialVersionUID = 8421564539650587600L;
    private String assetsTypeId;

    private String assetsTypeName;

    public String getAssetsTypeId() {
        return assetsTypeId;
    }

    public void setAssetsTypeId(String assetsTypeId) {
        this.assetsTypeId = assetsTypeId == null ? null : assetsTypeId.trim();
    }

    public String getAssetsTypeName() {
        return assetsTypeName;
    }

    public void setAssetsTypeName(String assetsTypeName) {
        this.assetsTypeName = assetsTypeName == null ? null : assetsTypeName.trim();
    }
}