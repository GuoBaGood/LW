package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAllDepreciation;

public interface DvAllDepreciationMapper {
    int deleteByPrimaryKey(String depId);

    int insert(DvAllDepreciation record);

    int insertSelective(DvAllDepreciation record);

    DvAllDepreciation selectByPrimaryKey(String depId);

    int updateByPrimaryKeySelective(DvAllDepreciation record);

    int updateByPrimaryKey(DvAllDepreciation record);
}