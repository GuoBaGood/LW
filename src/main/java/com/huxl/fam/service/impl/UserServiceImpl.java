package com.huxl.fam.service.impl;

import com.huxl.fam.entity.DvUser;
import com.huxl.fam.mapper.DvUserMapper;
import com.huxl.fam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: UserServiceImpl
 * 作者:huxl_oup
 * 日期:2019/3/13 11:04
 * 描述：用户信息
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private DvUserMapper dvUserMapper;
    @Override
    public DvUser queryUserByAP(DvUser user) {
        return dvUserMapper.queryUserByAP(user);
    }
}
