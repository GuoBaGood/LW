package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsReduce;

public interface DvAssetsReduceMapper {
    int deleteByPrimaryKey(String reduceId);

    int insert(DvAssetsReduce record);

    int insertSelective(DvAssetsReduce record);

    DvAssetsReduce selectByPrimaryKey(String reduceId);

    int updateByPrimaryKeySelective(DvAssetsReduce record);

    int updateByPrimaryKey(DvAssetsReduce record);
}