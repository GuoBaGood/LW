package com.huxl.fam.tool;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BaseResponse
 * 作者:huxl_oup
 * 日期:2019/3/13 13:46
 * 描述：数据返回
 */
public class BaseResponse {
    //返回码
    private Integer responseCode;
    //返回描述
    private String responseDesc;

    private Object entity;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }
}
