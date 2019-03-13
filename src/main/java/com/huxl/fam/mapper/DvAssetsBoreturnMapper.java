package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsBoreturn;

public interface DvAssetsBoreturnMapper {
    int deleteByPrimaryKey(String boreturnId);

    int insert(DvAssetsBoreturn record);

    int insertSelective(DvAssetsBoreturn record);

    DvAssetsBoreturn selectByPrimaryKey(String boreturnId);

    int updateByPrimaryKeySelective(DvAssetsBoreturn record);

    int updateByPrimaryKeyWithBLOBs(DvAssetsBoreturn record);

    int updateByPrimaryKey(DvAssetsBoreturn record);
}