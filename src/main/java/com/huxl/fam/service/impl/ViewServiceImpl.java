package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvAssetsRepair;
import com.huxl.fam.mapper.DvAssetsBoreturnMapper;
import com.huxl.fam.mapper.DvAssetsRepairMapper;
import com.huxl.fam.mapper.DvBorrowCmpMapper;
import com.huxl.fam.service.ViewService;
import com.huxl.fam.vo.BarVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: ViewServiceImpl
 * 作者:huxl_oup
 * 日期:2019/4/21 16:25
 * 描述：视图处理
 */
@Service
public class ViewServiceImpl implements ViewService{
    @Autowired
    private DvAssetsBoreturnMapper boreturnMapper;

    @Autowired
    private DvAssetsRepairMapper repairMapper;


    @Override
    public List<BarVo> queryByDate() {
        //租借记录
        BarVo vo1 = new BarVo();
        List<Integer> bt = boreturnMapper.queryByDate();
        vo1.setData(bt);
        vo1.setName("租借资产");
        vo1.setType("bar");
        //vo1.setBarGap(0);
        BarVo vo2 = new BarVo();
        List<Integer> rp = repairMapper.queryByDate();
        vo2.setData(rp);
        vo2.setName("维修资产");
        vo2.setType("bar");
        List<BarVo> voList = new ArrayList<>();
        voList.add(vo1);
        voList.add(vo2);
        return voList;
    }
}
