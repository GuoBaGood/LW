package com.huxl.fam.entity;

import java.io.Serializable;


public class DvPowerDict implements Serializable {

    private static final long serialVersionUID = -9080525232087018018L;
    private Integer powerId;

    private String powerName;

    private Integer powerParentId;

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public Integer getPowerParentId() {
        return powerParentId;
    }

    public void setPowerParentId(Integer powerParentId) {
        this.powerParentId = powerParentId;
    }
}