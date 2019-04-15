package com.huxl.fam.mapper;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.huxl.fam.entity.DvAssetsDetails;
import com.huxl.fam.entity.DvAssetsType;
import com.huxl.fam.entity.DvUser;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: DvUserMapperTest
 * 作者:huxl_oup
 * 日期:2019/3/13 10:36
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DvUserMapperTest {
    @Autowired
    private DvUserMapper dvUserMapper;

    @Autowired
    private DvAssetsDetailsMapper detailsMapper;
    @Test
    @Ignore
    public void selectByPrimaryKey() throws Exception {
        DvUser dvUser = dvUserMapper.selectByPrimaryKey("1");
        System.out.println("hh");
    }

    @Test
    @Ignore
    public void t() throws Exception {
        PageBounds pageBounds = new PageBounds();
        pageBounds.setPage(1);
        pageBounds.setLimit(5);
        //List<String> dvAssetsDetails = detailsMapper.tt(pageBounds);
        List<DvAssetsDetails> dvAssetsDetails = detailsMapper.queryDatasBypage(new DvAssetsDetails(), pageBounds);
        System.out.println("hhh");
    }

    @Test
    @Ignore
    public void f() throws Exception {
        DvAssetsDetails d = detailsMapper.selectByPrimaryKey("GD00501035");
        System.out.println("hh");
    }

    @Autowired
    private DvAssetsTypeMapper typeMapper;

    @Test
    public void ff() throws Exception {
        List<DvAssetsType> list = null;
    }
}