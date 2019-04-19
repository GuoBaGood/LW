package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvLog;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: LogService
 * 作者:huxl_oup
 * 日期:2019/4/19 22:46
 * 描述：日志管理
 */
public interface LogService {
    List<DvLog> queryLogRecord(DvLog log, PageBounds pageBounds);

    int queryNum(DvLog log);
}
