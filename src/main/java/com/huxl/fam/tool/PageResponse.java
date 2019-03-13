package com.huxl.fam.tool;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: PageResponse
 * 作者:huxl_oup
 * 日期:2019/3/13 13:46
 * 描述：数据放回
 */
public class PageResponse extends BaseResponse{
    //数据总条数
    private long total;
    //数据
    private List data;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
