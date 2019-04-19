package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvLog;

public interface DvLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(DvLog record);

    int insertSelective(DvLog record);

    DvLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(DvLog record);

    int updateByPrimaryKey(DvLog record);
}