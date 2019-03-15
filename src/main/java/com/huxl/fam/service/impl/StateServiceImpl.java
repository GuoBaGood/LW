package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvState;
import com.huxl.fam.mapper.DvStateMapper;
import com.huxl.fam.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: StateServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 11:03
 * 描述：资产状态：使用中等
 */

@Service
public class StateServiceImpl implements StateService{
    @Autowired
    private DvStateMapper stateMapper;
    @Override
    public List<DvState> queryAllState() {
        return stateMapper.queryAllState();
    }
}
