package com.huxl.fam.entity;

import java.io.Serializable;

public class DvUserPower implements Serializable {
    private static final long serialVersionUID = 451116759594699498L;
    private String userpId;

    private String dvUserId;

    private String dvPowerId;

    public String getUserpId() {
        return userpId;
    }

    public void setUserpId(String userpId) {
        this.userpId = userpId == null ? null : userpId.trim();
    }

    public String getDvUserId() {
        return dvUserId;
    }

    public void setDvUserId(String dvUserId) {
        this.dvUserId = dvUserId == null ? null : dvUserId.trim();
    }

    public String getDvPowerId() {
        return dvPowerId;
    }

    public void setDvPowerId(String dvPowerId) {
        this.dvPowerId = dvPowerId == null ? null : dvPowerId.trim();
    }
}