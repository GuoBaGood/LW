package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsUnused;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: UnusedService
 * 作者:huxl_oup
 * 日期:2019/4/18 22:26
 * 描述：闲置状态
 */
public interface UnusedService {

    List<DvAssetsUnused> queryUnusedByPage(DvAssetsUnused d, PageBounds pageBounds);

    int queryNum();
}
