package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsReduce;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsReduceService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:53
 * 描述：减少资产
 */
public interface AssetsReduceService {
    List<DvAssetsReduce> queryReduce(DvAssetsReduce d , PageBounds pageBounds);
    int queryNum(DvAssetsReduce d);
}
