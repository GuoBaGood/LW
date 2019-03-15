package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvAssetsType;
import com.huxl.fam.mapper.DvAssetsTypeMapper;
import com.huxl.fam.service.AssetsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsTypeServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:57
 * 描述：资产类型
 */
@Service
public class AssetsTypeServiceImpl implements AssetsTypeService{
    @Autowired
    private DvAssetsTypeMapper typeMapper;
    @Override
    public List<DvAssetsType> queryAllTyep() {
        return typeMapper.queryAllTyep();
    }
}
