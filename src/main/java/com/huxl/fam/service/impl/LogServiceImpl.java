package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvLog;
import com.huxl.fam.mapper.DvLogMapper;
import com.huxl.fam.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: LogServiceImpl
 * 作者:huxl_oup
 * 日期:2019/4/19 22:46
 * 描述：日志管理
 */

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private DvLogMapper logMapper;
    @Override
    public List<DvLog> queryLogRecord(DvLog log, PageBounds pageBounds) {
        return logMapper.queryLogRecord(log, pageBounds);
    }

    @Override
    public int queryNum(DvLog log) {
        return logMapper.queryNum(log);
    }
}
