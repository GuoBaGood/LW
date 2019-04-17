package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvDept;
import com.huxl.fam.mapper.DvDeptMapper;
import com.huxl.fam.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: DeptServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 11:02
 * 描述：部门信息
 */
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DvDeptMapper dvDeptMapper;
    @Override
    public List<DvDept> queryDepts() {
        return dvDeptMapper.queryDepts();
    }
}
