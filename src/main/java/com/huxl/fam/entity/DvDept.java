package com.huxl.fam.entity;

import java.io.Serializable;

public class DvDept implements Serializable{
    private static final long serialVersionUID = -5316811773948956830L;

    private String deptId;

    private String deptName;

    private String deptPrinciple;

    private String deptPhone;

    private String deptAdddesec;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptPrinciple() {
        return deptPrinciple;
    }

    public void setDeptPrinciple(String deptPrinciple) {
        this.deptPrinciple = deptPrinciple == null ? null : deptPrinciple.trim();
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone == null ? null : deptPhone.trim();
    }

    public String getDeptAdddesec() {
        return deptAdddesec;
    }

    public void setDeptAdddesec(String deptAdddesec) {
        this.deptAdddesec = deptAdddesec == null ? null : deptAdddesec.trim();
    }
}