package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsDetails;

public interface DvAssetsDetailsMapper {
    int deleteByPrimaryKey(String assetsId);

    int insert(DvAssetsDetails record);

    int insertSelective(DvAssetsDetails record);

    DvAssetsDetails selectByPrimaryKey(String assetsId);

    int updateByPrimaryKeySelective(DvAssetsDetails record);

    int updateByPrimaryKeyWithBLOBs(DvAssetsDetails record);

    int updateByPrimaryKey(DvAssetsDetails record);
}