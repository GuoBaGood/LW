package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvDepAccounting;

public interface DvDepAccountingMapper {
    int deleteByPrimaryKey(String depId);

    int insert(DvDepAccounting record);

    int insertSelective(DvDepAccounting record);

    DvDepAccounting selectByPrimaryKey(String depId);

    int updateByPrimaryKeySelective(DvDepAccounting record);

    int updateByPrimaryKeyWithBLOBs(DvDepAccounting record);

    int updateByPrimaryKey(DvDepAccounting record);
}