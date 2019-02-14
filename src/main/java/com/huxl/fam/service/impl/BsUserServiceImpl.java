package com.huxl.fam.service.impl;

import com.huxl.fam.entity.BsUser;
import com.huxl.fam.mapper.BsUserMapper;
import com.huxl.fam.service.BsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BsUserServiceImpl
 * 作者:huxl_oup
 * 日期:2019/2/13 16:57
 * 描述：service接口
 */

@Service
public class BsUserServiceImpl implements BsUserService{

    @Autowired
    private BsUserMapper bsUserMapper;

    @Override
    public int deleteByPrimaryKey(String uId) {
        return bsUserMapper.deleteByPrimaryKey(uId);
    }

    @Override
    public int insert(BsUser record) {
        return bsUserMapper.insert(record);
    }

    @Override
    public int insertSelective(BsUser record) {
        return bsUserMapper.insertSelective(record);
    }

    @Override
    public BsUser selectByPrimaryKey(String uId) {
        return bsUserMapper.selectByPrimaryKey(uId);
    }

    @Override
    public int updateByPrimaryKeySelective(BsUser record) {
        return bsUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BsUser record) {
        return bsUserMapper.updateByPrimaryKey(record);
    }
}
