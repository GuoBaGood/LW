package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvAssetsRepair;

public interface DvAssetsRepairMapper {
    int deleteByPrimaryKey(String repairId);

    int insert(DvAssetsRepair record);

    int insertSelective(DvAssetsRepair record);

    DvAssetsRepair selectByPrimaryKey(String repairId);

    int updateByPrimaryKeySelective(DvAssetsRepair record);

    int updateByPrimaryKey(DvAssetsRepair record);
}