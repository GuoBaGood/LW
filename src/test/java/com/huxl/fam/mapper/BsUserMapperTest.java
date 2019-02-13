package com.huxl.fam.mapper;

import com.huxl.fam.entity.BsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: BsUserMapperTest
 * 作者:huxl_oup
 * 日期:2019/2/13 14:37
 * 描述：测试BsUserMapper的方法
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BsUserMapperTest {

    @Autowired
    private BsUserMapper bsUserMapper;
    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
        BsUser bsUser = bsUserMapper.selectByPrimaryKey("1");
        System.out.println(bsUser.getuName());
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}