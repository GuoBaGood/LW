package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsRepair;
import com.huxl.fam.mapper.DvAssetsRepairMapper;
import com.huxl.fam.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: RepairServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:56
 * 描述：修理资产
 */
@Service
public class RepairServiceImpl implements RepairService{
    @Autowired
    private DvAssetsRepairMapper repairMapper;
    @Override
    public List<DvAssetsRepair> queryRepairingAssets(DvAssetsRepair d, PageBounds pageBounds) {
        return repairMapper.queryRepairingAssets(d, pageBounds);
    }

    @Override
    public int queryRepairingAssetsNum(DvAssetsRepair d) {
        return repairMapper.queryRepairingAssetsNum(d);
    }
}
