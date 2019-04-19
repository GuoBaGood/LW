package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsBoreturn;
import com.huxl.fam.mapper.DvAssetsBoreturnMapper;
import com.huxl.fam.service.BoreturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsBoreturnServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:46
 * 描述：租借资产
 */

@Service
public class BoreturnServiceImpl implements BoreturnService {
    @Autowired
    private DvAssetsBoreturnMapper boreturnMapper;
    @Override
    public List<DvAssetsBoreturn> selectBoreturn(DvAssetsBoreturn boreturn, PageBounds pageBounds) {
        return boreturnMapper.selectBoreturn(boreturn, pageBounds);
    }

    @Override
    public int queryNum(DvAssetsBoreturn boreturn) {
        return boreturnMapper.queryNum(boreturn);
    }
}
