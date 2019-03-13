package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsType;

public interface DvAssetsTypeMapper {
    int deleteByPrimaryKey(String assetsTypeId);

    int insert(DvAssetsType record);

    int insertSelective(DvAssetsType record);

    DvAssetsType selectByPrimaryKey(String assetsTypeId);

    int updateByPrimaryKeySelective(DvAssetsType record);

    int updateByPrimaryKey(DvAssetsType record);
}