package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsRepair;
import com.huxl.fam.vo.BarVo;

import java.util.List;

public interface DvAssetsRepairMapper {
    int deleteByPrimaryKey(String repairId);

    int insert(DvAssetsRepair record);

    int insertSelective(DvAssetsRepair record);

    DvAssetsRepair selectByPrimaryKey(String repairId);

    int updateByPrimaryKeySelective(DvAssetsRepair record);

    int updateByPrimaryKey(DvAssetsRepair record);

    //条件分页查询：
    List<DvAssetsRepair> queryRepairingAssets(DvAssetsRepair d, PageBounds pageBounds);

    //满足条件的数量
    int queryRepairingAssetsNum(DvAssetsRepair d);

    List<Integer> queryByDate();
}