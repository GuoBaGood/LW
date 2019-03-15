package com.huxl.fam.service;

import com.huxl.fam.entity.DvState;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: StateService
 * 作者:huxl_oup
 * 日期:2019/3/13 11:03
 * 描述：资产状态：使用中等
 */
public interface StateService {
    //查询所有
    List<DvState> queryAllState();
}
