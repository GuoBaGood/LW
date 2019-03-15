package com.huxl.fam.service;

import com.huxl.fam.entity.DvAssetsType;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsTypeService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:57
 * 描述：资产类型
 */
public interface AssetsTypeService {
    //查询所有类型：
    List<DvAssetsType> queryAllTyep();
}
