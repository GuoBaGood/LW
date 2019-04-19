package com.huxl.fam.service.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsBoreturn;
import com.huxl.fam.entity.DvAssetsDetails;
import com.huxl.fam.entity.DvAssetsUnused;
import com.huxl.fam.mapper.DvAssetsBoreturnMapper;
import com.huxl.fam.mapper.DvAssetsDetailsMapper;
import com.huxl.fam.mapper.DvAssetsUnusedMapper;
import com.huxl.fam.service.AssetsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: AssetsDetailServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 10:52
 * 描述：资产详情
 */
@Service
public class AssetsDetailServiceImpl implements AssetsDetailService{
    @Autowired
    private DvAssetsDetailsMapper detailsMapper;

    @Autowired
    DvAssetsUnusedMapper unusedMapper;

    @Autowired
    DvAssetsBoreturnMapper boreturnMapper;

    @Override
    public List<DvAssetsDetails> queryDatasBypage(DvAssetsDetails d, PageBounds pageBounds) {
        return detailsMapper.queryDatasBypage(d,pageBounds);
    }

    @Override
    public int queryNumByCon(DvAssetsDetails d) {
        return detailsMapper.queryNumByCon(d);
    }

    @Override
    public String insertSelective(DvAssetsDetails record) {
        String str = "error";
        try{
            detailsMapper.insertSelective(record);
            str = "success";
        }catch (Exception e){
            e.printStackTrace();
        }
        return str;
    }

    @Override

    @Transactional(rollbackFor = Exception.class)
    public String insertMore(Map map) {
        String str = "error";
        DvAssetsDetails d  = (DvAssetsDetails)map.get("assets");
        DvAssetsUnused u = (DvAssetsUnused)map.get("unused");
        DvAssetsBoreturn bt = (DvAssetsBoreturn)map.get("boreturn");
        String type = (String)map.get("type");
        try{
            if (type.equals("unused")){
                unusedMapper.insertSelective(u);
            }
            if (type.equals("boreturn")){
                boreturnMapper.insertSelective(bt);
            }
            detailsMapper.insertSelective(d);
            str = "success";
        }catch (Exception e){
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//关键
        }

        return str;
    }
}
