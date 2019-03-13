package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvUser;

public interface DvUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(DvUser record);

    int insertSelective(DvUser record);

    DvUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(DvUser record);

    int updateByPrimaryKey(DvUser record);
}