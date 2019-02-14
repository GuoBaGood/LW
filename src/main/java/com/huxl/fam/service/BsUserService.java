package com.huxl.fam.service;

import com.huxl.fam.entity.BsUser;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BsUserService
 * 作者:huxl_oup
 * 日期:2019/2/13 16:56
 * 描述：
 */
public interface BsUserService {
    int deleteByPrimaryKey(String uId);

    int insert(BsUser record);

    int insertSelective(BsUser record);

    BsUser selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(BsUser record);

    int updateByPrimaryKey(BsUser record);
}
