package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvLog;

import java.util.List;

public interface DvLogMapper {
    int deleteByPrimaryKey(String logId);

    int insert(DvLog record);

    int insertSelective(DvLog record);

    DvLog selectByPrimaryKey(String logId);

    int updateByPrimaryKeySelective(DvLog record);

    int updateByPrimaryKey(DvLog record);

    List<DvLog> queryLogRecord(DvLog log, PageBounds pageBounds);

    int queryNum(DvLog log);
}