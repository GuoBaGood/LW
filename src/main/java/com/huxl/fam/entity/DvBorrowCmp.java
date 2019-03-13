package com.huxl.fam.entity;

import java.io.Serializable;

public class DvBorrowCmp implements Serializable{
    private static final long serialVersionUID = -3063178533179593101L;

    private String cmpId;

    private String cmpName;

    private String legalPerson;

    private String cmpAddress;

    private String servicePhone;

    private String cmpEmail;

    public String getCmpId() {
        return cmpId;
    }

    public void setCmpId(String cmpId) {
        this.cmpId = cmpId == null ? null : cmpId.trim();
    }

    public String getCmpName() {
        return cmpName;
    }

    public void setCmpName(String cmpName) {
        this.cmpName = cmpName == null ? null : cmpName.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public String getCmpAddress() {
        return cmpAddress;
    }

    public void setCmpAddress(String cmpAddress) {
        this.cmpAddress = cmpAddress == null ? null : cmpAddress.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getCmpEmail() {
        return cmpEmail;
    }

    public void setCmpEmail(String cmpEmail) {
        this.cmpEmail = cmpEmail == null ? null : cmpEmail.trim();
    }
}