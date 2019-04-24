package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvUserPower;

public interface DvUserPowerMapper {
    int deleteByPrimaryKey(String userpId);

    int insert(DvUserPower record);

    int insertSelective(DvUserPower record);

    DvUserPower selectByPrimaryKey(String userpId);

    int updateByPrimaryKeySelective(DvUserPower record);

    int updateByPrimaryKey(DvUserPower record);
}