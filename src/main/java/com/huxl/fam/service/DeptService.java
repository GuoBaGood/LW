package com.huxl.fam.service;

import com.huxl.fam.entity.DvDept;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: DeptService
 * 作者:huxl_oup
 * 日期:2019/3/13 11:01
 * 描述：部门信息
 */
public interface DeptService {
    List<DvDept> queryDepts();
}
