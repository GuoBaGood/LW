package com.huxl.fam.service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvUser;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: UserService
 * 作者:huxl_oup
 * 日期:2019/3/13 11:04
 * 描述：用户信息
 */
public interface UserService {
    //根据用户名、密码查询用户：
    DvUser queryUserByAP(DvUser user);

    List<DvUser> personDat(DvUser user, PageBounds pageBounds);

    int queryNumByCon();

    void personDelete(DvUser user);
}
