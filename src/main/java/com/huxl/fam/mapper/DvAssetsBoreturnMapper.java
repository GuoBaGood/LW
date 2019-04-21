package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsBoreturn;
import com.huxl.fam.vo.BarVo;
import com.huxl.fam.vo.ConditionVo;

import java.util.List;
import java.util.Map;

public interface DvAssetsBoreturnMapper {
    int deleteByPrimaryKey(String boreturnId);

    int insert(DvAssetsBoreturn record);

    int insertSelective(DvAssetsBoreturn record);

    DvAssetsBoreturn selectByPrimaryKey(String boreturnId);

    int updateByPrimaryKeySelective(DvAssetsBoreturn record);

    int updateByPrimaryKey(DvAssetsBoreturn record);

    List<DvAssetsBoreturn> selectBoreturn(DvAssetsBoreturn boreturn, PageBounds pageBounds);

    int queryNum(DvAssetsBoreturn boreturn);

    Map<String,Object> queryDataByYear(ConditionVo vo);
}