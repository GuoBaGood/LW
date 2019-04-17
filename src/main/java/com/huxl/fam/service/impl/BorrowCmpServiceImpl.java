package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvBorrowCmp;
import com.huxl.fam.mapper.DvBorrowCmpMapper;
import com.huxl.fam.service.BorrowCmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BorrowCmpServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:59
 * 描述：租借资产的企业信息
 */
@Service
public class BorrowCmpServiceImpl implements BorrowCmpService{
    @Autowired
    private DvBorrowCmpMapper borrowCmpMapper;
    @Override
    public List<DvBorrowCmp> queryCmp() {
        return borrowCmpMapper.queryCmp();
    }

    @Override
    public String insertSelective(DvBorrowCmp record) {
        String str = "error";
        try{
            int a = borrowCmpMapper.insertSelective(record);
            str = "success";
        }catch (Exception e){
            e.printStackTrace();

        }
        return str;
    }
}
