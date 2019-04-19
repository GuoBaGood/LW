package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsReduce;

import java.util.List;

public interface DvAssetsReduceMapper {
    int deleteByPrimaryKey(String reduceId);

    int insert(DvAssetsReduce record);

    int insertSelective(DvAssetsReduce record);

    DvAssetsReduce selectByPrimaryKey(String reduceId);

    int updateByPrimaryKeySelective(DvAssetsReduce record);

    int updateByPrimaryKey(DvAssetsReduce record);

    List<DvAssetsReduce> queryReduce(DvAssetsReduce d , PageBounds pageBounds);

    int queryNum(DvAssetsReduce d);
}
