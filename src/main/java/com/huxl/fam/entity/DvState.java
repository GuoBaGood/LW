package com.huxl.fam.entity;

import java.io.Serializable;

public class DvState implements Serializable{
    private static final long serialVersionUID = 6518351859385576718L;

    private String stateId;

    private String stateName;

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId == null ? null : stateId.trim();
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }
}