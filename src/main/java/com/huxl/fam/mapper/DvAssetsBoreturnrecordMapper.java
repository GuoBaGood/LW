package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsBoreturnrecord;

public interface DvAssetsBoreturnrecordMapper {
    int deleteByPrimaryKey(String boreturnId);

    int insert(DvAssetsBoreturnrecord record);

    int insertSelective(DvAssetsBoreturnrecord record);

    DvAssetsBoreturnrecord selectByPrimaryKey(String boreturnId);

    int updateByPrimaryKeySelective(DvAssetsBoreturnrecord record);

    int updateByPrimaryKeyWithBLOBs(DvAssetsBoreturnrecord record);

    int updateByPrimaryKey(DvAssetsBoreturnrecord record);
}