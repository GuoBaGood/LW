package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsRepairecord;

public interface DvAssetsRepairecordMapper {
    int deleteByPrimaryKey(String repairecordId);

    int insert(DvAssetsRepairecord record);

    int insertSelective(DvAssetsRepairecord record);

    DvAssetsRepairecord selectByPrimaryKey(String repairecordId);

    int updateByPrimaryKeySelective(DvAssetsRepairecord record);

    int updateByPrimaryKey(DvAssetsRepairecord record);
}