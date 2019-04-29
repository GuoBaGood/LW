package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvUser;

import java.util.List;

public interface DvUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(DvUser record);

    int insertSelective(DvUser record);

    DvUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(DvUser record);

    int updateByPrimaryKey(DvUser record);

    //根据用户名、密码查询用户：
    DvUser queryUserByAP(DvUser user);
    //查询用户列表
    List<DvUser> personDat(DvUser record, PageBounds pageBounds);
    //查询用户总数
    int queryNumByCon();
    //根据id删除用户
    void personDelete(DvUser user);
}