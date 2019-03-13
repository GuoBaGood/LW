package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvBorrowCmp;

public interface DvBorrowCmpMapper {
    int deleteByPrimaryKey(String cmpId);

    int insert(DvBorrowCmp record);

    int insertSelective(DvBorrowCmp record);

    DvBorrowCmp selectByPrimaryKey(String cmpId);

    int updateByPrimaryKeySelective(DvBorrowCmp record);

    int updateByPrimaryKey(DvBorrowCmp record);
}