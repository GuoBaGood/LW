package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvLog;

public interface DvLogMapper {
    int deleteByPrimaryKey(String logid);

    int insert(DvLog record);

    int insertSelective(DvLog record);

    DvLog selectByPrimaryKey(String logid);

    int updateByPrimaryKeySelective(DvLog record);

    int updateByPrimaryKey(DvLog record);
}