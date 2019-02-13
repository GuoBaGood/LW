package com.huxl.fam.mapper;

import com.huxl.fam.entity.BsUser;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BsUserMapper
 * 作者:huxl_oup
 * 日期:2019/2/13 14:33
 * 描述：
 */
public interface BsUserMapper {
    int deleteByPrimaryKey(String uId);

    int insert(BsUser record);

    int insertSelective(BsUser record);

    BsUser selectByPrimaryKey(String uId);

    int updateByPrimaryKeySelective(BsUser record);

    int updateByPrimaryKey(BsUser record);
}
