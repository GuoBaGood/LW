package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvState;

public interface DvStateMapper {
    int deleteByPrimaryKey(String stateId);

    int insert(DvState record);

    int insertSelective(DvState record);

    DvState selectByPrimaryKey(String stateId);

    int updateByPrimaryKeySelective(DvState record);

    int updateByPrimaryKey(DvState record);
}