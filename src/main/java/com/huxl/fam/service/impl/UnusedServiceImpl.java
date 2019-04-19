package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsUnused;
import com.huxl.fam.mapper.DvAssetsUnusedMapper;
import com.huxl.fam.service.UnusedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: UnusedServiceImpl
 * 作者:huxl_oup
 * 日期:2019/4/18 22:27
 * 描述：闲置状态
 */
@Service
public class UnusedServiceImpl implements UnusedService{
    @Autowired
    private DvAssetsUnusedMapper unusedMapper;
    @Override
    public List<DvAssetsUnused> queryUnusedByPage(DvAssetsUnused d, PageBounds pageBounds) {
        return unusedMapper.queryUnusedByPage(d,pageBounds);
    }

    @Override
    public int queryNum() {
        return unusedMapper.queryNum();
    }

    @Override
    public int insertSelective(DvAssetsUnused record) {
        return unusedMapper.insertSelective(record);
    }
}
