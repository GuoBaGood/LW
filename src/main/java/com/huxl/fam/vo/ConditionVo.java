package com.huxl.fam.vo;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Date;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ConditionVo
 * 作者:huxl_oup
 * 日期:2019/4/21 19:03
 * 描述：查询的条件
 */
public class ConditionVo {
    private Date startTime;
    private Date endTime;
    private Integer year ;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
