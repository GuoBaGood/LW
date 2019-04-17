package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvDept;

import java.util.List;

public interface DvDeptMapper {
    int deleteByPrimaryKey(String deptId);

    int insert(DvDept record);

    int insertSelective(DvDept record);

    DvDept selectByPrimaryKey(String deptId);

    int updateByPrimaryKeySelective(DvDept record);

    int updateByPrimaryKey(DvDept record);

    List<DvDept> queryDepts();
}