package com.huxl.fam.tool;

import com.huxl.fam.entity.DvLog;
import com.huxl.fam.mapper.DvLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: Log
 * 作者:huxl_oup
 * 日期:2019/4/19 15:29
 * 描述：处理日志
 */
@Component
public class Log {
    @Autowired
    private DvLogMapper logMapper;

    private static DvLogMapper lgMapper;

    @PostConstruct
    public void init() {
        lgMapper = logMapper;
    }

    public static void ADDLOG(HttpServletRequest request, String  desc){
        DvLog lg = new DvLog();
        lg.setLogId(ComTool.deptId(ComTool.LOG_ID));
        lg.setAccount(ComTool.UserDatas(request).getAccount());
        lg.setManageName(ComTool.UserDatas(request).getUserRealname());
        lg.setLogDesc(desc);
        lg.setManageTime(new Date());
        try {
            lgMapper.insertSelective(lg);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
