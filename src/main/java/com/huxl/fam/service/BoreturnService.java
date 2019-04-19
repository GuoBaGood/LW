package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsBoreturn;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BoreturnService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:45
 * 描述：租借资产
 */
public interface BoreturnService {

    List<DvAssetsBoreturn> selectBoreturn(DvAssetsBoreturn boreturn, PageBounds pageBounds);

    int queryNum(DvAssetsBoreturn boreturn);
}
