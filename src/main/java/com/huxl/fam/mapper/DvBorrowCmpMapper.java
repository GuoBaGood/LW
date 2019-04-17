package com.huxl.fam.mapper;

import com.huxl.fam.entity.DvBorrowCmp;

import java.util.List;

public interface DvBorrowCmpMapper {
    int deleteByPrimaryKey(String cmpId);

    int insert(DvBorrowCmp record);

    int insertSelective(DvBorrowCmp record);

    DvBorrowCmp selectByPrimaryKey(String cmpId);

    int updateByPrimaryKeySelective(DvBorrowCmp record);

    int updateByPrimaryKey(DvBorrowCmp record);

    List<DvBorrowCmp> queryCmp();
}