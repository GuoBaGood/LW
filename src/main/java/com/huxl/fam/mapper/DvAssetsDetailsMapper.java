package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsDetails;

import java.util.List;

public interface DvAssetsDetailsMapper {
    int deleteByPrimaryKey(String assetsId);

    int insert(DvAssetsDetails record);

    int insertSelective(DvAssetsDetails record);

    DvAssetsDetails selectByPrimaryKey(String assetsId);

    int updateByPrimaryKeySelective(DvAssetsDetails record);

    int updateByPrimaryKey(DvAssetsDetails record);

    //条件分页查询：
    List<DvAssetsDetails> queryDatasBypage(DvAssetsDetails d, PageBounds pageBounds);

    //满足条件的数量
    int queryNumByCon(DvAssetsDetails d);
}