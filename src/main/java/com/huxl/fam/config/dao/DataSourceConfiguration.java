package com.huxl.fam.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * Created with IDEA
 * 项目名: fam
 * 文件名: DataSourceConfiguration
 * 作者:huxl_oup
 * 日期:2019/2/13 13:56
 * 描述：数据库的连接
 */

@Configuration //告诉spring容器去解析相关的bean
@MapperScan("com.huxl.fam.mapper") //配置mybatis的mapper扫描路径
public class DataSourceConfiguration {

    //读取配置文件的内容
    @Value("${jdbc.driver}")
    private String jdbcDriver; //连接的驱动；
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource b = new ComboPooledDataSource();
        b.setDriverClass(jdbcDriver);
        b.setJdbcUrl(jdbcUrl);
        b.setUser(userName);
        b.setPassword(password);
        b.setAutoCommitOnClose(false); //连接池关闭是否自动提交


        return b;
    }
}
