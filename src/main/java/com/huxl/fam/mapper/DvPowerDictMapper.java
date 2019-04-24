package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvPowerDict;

public interface DvPowerDictMapper {
    int deleteByPrimaryKey(Integer powerId);

    int insert(DvPowerDict record);

    int insertSelective(DvPowerDict record);

    DvPowerDict selectByPrimaryKey(Integer powerId);

    int updateByPrimaryKeySelective(DvPowerDict record);

    int updateByPrimaryKey(DvPowerDict record);
}