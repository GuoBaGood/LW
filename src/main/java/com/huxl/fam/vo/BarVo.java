package com.huxl.fam.vo;

import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BarVo
 * 作者:huxl_oup
 * 日期:2019/4/21 15:25
 * 描述：柱状图相关的数据
 */
public class BarVo {
    private String  name;
    private String type;
    private int barGap;
    private List<Integer> data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBarGap() {
        return barGap;
    }

    public void setBarGap(int barGap) {
        this.barGap = barGap;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }
}


