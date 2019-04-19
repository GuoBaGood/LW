package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsReduce;
import com.huxl.fam.mapper.DvAssetsReduceMapper;
import com.huxl.fam.service.AssetsReduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsReduceServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:53
 * 描述：减少资产
 */

@Service
public class AssetsReduceServiceImpl implements AssetsReduceService{
    @Autowired
    private DvAssetsReduceMapper reduceMapper;

    @Override
    public List<DvAssetsReduce> queryReduce(DvAssetsReduce d, PageBounds pageBounds) {
        return reduceMapper.queryReduce(d, pageBounds);
    }

    @Override
    public int queryNum(DvAssetsReduce d) {
        return reduceMapper.queryNum(d);
    }
}
