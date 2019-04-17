package com.huxl.fam.service;

import com.huxl.fam.entity.DvBorrowCmp;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BorrowCmpService
 * 作者:huxl_oup
 * 日期:2019/3/13 10:59
 * 描述：租借资产的企业信息
 */
public interface BorrowCmpService {
    List<DvBorrowCmp> queryCmp();

    String insertSelective(DvBorrowCmp record);
}
