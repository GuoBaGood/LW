package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsRepair;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: RepairService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:55
 * 描述：修理资产
 */
public interface RepairService {
    List<DvAssetsRepair> queryRepairingAssets(DvAssetsRepair d, PageBounds pageBounds);

    //满足条件的数量
    int queryRepairingAssetsNum(DvAssetsRepair d);

    //更新数据
    void updateObject(DvAssetsRepair dRepair);
}
