package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvAssetsReduce;
import com.huxl.fam.entity.DvAssetsRepair;
import com.huxl.fam.mapper.*;
import com.huxl.fam.service.ViewService;
import com.huxl.fam.tool.ComUtil;
import com.huxl.fam.vo.BarVo;
import com.huxl.fam.vo.ConditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private DvAssetsReduceMapper reduceMapper;

    @Autowired
    private DvAssetsUnusedMapper unusedMapper;

    @Override
    public List<BarVo> queryByDate(ConditionVo cvo) {
        //租借记录
        BarVo vo1 = new BarVo();
        Map<String,Object> bt = boreturnMapper.queryDataByYear(cvo);
        List<Integer> list1 = new ArrayList<>();
        for (String key:bt.keySet()){
            Integer value = Integer.parseInt(bt.get(key.toString()).toString());
            list1.add(value);
        }
        vo1.setData(list1);
        vo1.setName("租借资产");
        vo1.setType("bar");
        //维修资产
        BarVo vo2 = new BarVo();
        Map<String,Object> rp = boreturnMapper.queryDataByYear(cvo);
        List<Integer> list2 = new ArrayList<>();
        for (String key:rp.keySet()){
            Integer value = Integer.parseInt(rp.get(key.toString()).toString());
            list2.add(value);
        }
        vo2.setData(list2);
        vo2.setName("维修资产");
        vo2.setType("bar");
        //闲置资产
        BarVo vo3 = new BarVo();
        Map<String,Object> un = boreturnMapper.queryDataByYear(cvo);
        List<Integer> list3 = new ArrayList<>();
        for (String key:un.keySet()){
            Integer value = Integer.parseInt(un.get(key.toString()).toString());
            list3.add(value);
        }
        vo3.setData(list3);
        vo3.setType("bar");
        vo3.setName("闲置资产");
        //报废资产
        BarVo vo4 = new BarVo();
        Map<String,Object> rduce = boreturnMapper.queryDataByYear(cvo);
        List<Integer> list4 = new ArrayList<>();
        for (String key:rduce.keySet()){
            Integer value = Integer.parseInt(rduce.get(key.toString()).toString());
            list4.add(value);
        }
        vo4.setData(list4);
        vo4.setName("报废资产");
        vo4.setType("bar");
        List<BarVo> voList = new ArrayList<>();
        voList.add(vo1);
        voList.add(vo2);
        voList.add(vo3);
        voList.add(vo4);
        return voList;
    }
}
