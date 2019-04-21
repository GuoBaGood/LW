package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsUnused;
import com.huxl.fam.vo.ConditionVo;

import java.util.List;
import java.util.Map;

public interface DvAssetsUnusedMapper {
    int deleteByPrimaryKey(String unusedId);

    int insert(DvAssetsUnused record);

    int insertSelective(DvAssetsUnused record);

    DvAssetsUnused selectByPrimaryKey(String unusedId);

    int updateByPrimaryKeySelective(DvAssetsUnused record);

    int updateByPrimaryKey(DvAssetsUnused record);

    List<DvAssetsUnused> queryUnusedByPage(DvAssetsUnused d, PageBounds pageBounds);

    int queryNum();

    Map<String,Object> queryDataByYear(ConditionVo vo);
}