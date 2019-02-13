package com.huxl.fam.config.dao;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: SessionFactoryConfiguration
 * 作者:huxl_oup
 * 日期:2019/2/13 14:12
 * 描述：提交相关的事务
 */

@Configuration //告诉spring扫描该类
public class SessionFactoryConfiguration {

    @Value("${mybatis_config_file}")
    private String mybatisConfigPath;

    @Value("${mapper.path}")
    private String mapperPakagePath;

    @Value("${entity_path}")
    private String entityPath;

    @Autowired
    @Qualifier("dataSource") //该bean的别名
    private DataSource dataSource;

    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean s = new SqlSessionFactoryBean();
        s.setConfigLocation(new ClassPathResource(mybatisConfigPath));//扫描mybatis-config.xml文件

        //指定mapper的路径
        PathMatchingResourcePatternResolver p = new PathMatchingResourcePatternResolver();
        String mapperPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPakagePath;
        s.setMapperLocations(p.getResources(mapperPath));

        s.setDataSource(dataSource);
        s.setTypeAliasesPackage(entityPath); //映射实体类
        return s;
    }
}
