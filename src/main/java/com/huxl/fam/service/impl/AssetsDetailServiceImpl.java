package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsDetails;
import com.huxl.fam.mapper.DvAssetsDetailsMapper;
import com.huxl.fam.service.AssetsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsDetailServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:52
 * 描述：资产详情
 */
@Service
public class AssetsDetailServiceImpl implements AssetsDetailService{
    @Autowired
    private DvAssetsDetailsMapper detailsMapper;
    @Override
    public List<DvAssetsDetails> queryDatasBypage(DvAssetsDetails d, PageBounds pageBounds) {
        return detailsMapper.queryDatasBypage(d,pageBounds);
    }

    @Override
    public int queryNumByCon(DvAssetsDetails d) {
        return detailsMapper.queryNumByCon(d);
    }
}
