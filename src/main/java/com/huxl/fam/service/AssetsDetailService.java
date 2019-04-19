package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsDetailService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:52
 * 描述：资产详情
 */
public interface AssetsDetailService {
    //条件分页查询：
    List<DvAssetsDetails> queryDatasBypage(DvAssetsDetails d, PageBounds pageBounds);
    //满足条件的数量
    int queryNumByCon(DvAssetsDetails d);

    String insertSelective(DvAssetsDetails record);

    String insertMore(Map map);
}
