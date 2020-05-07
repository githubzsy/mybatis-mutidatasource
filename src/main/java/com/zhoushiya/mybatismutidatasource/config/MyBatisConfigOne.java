package com.zhoushiya.mybatismutidatasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration//声明该类是一个配置类
@MapperScan(basePackages = "com.zhoushiya.mybatismutidatasource.mapper.testdb", sqlSessionFactoryRef = "sqlSessionFactory1", sqlSessionTemplateRef = "sqlSessionTemplate1")
//扫描的包是com.lwh.mybatistest.mapper
//SqlSessionFactory根据dsTestdb创建，然后再根据创建好的SqlSessionFactory创建一个SqlSessionTemplate。
public class MyBatisConfigOne {
    @Resource(name = "dsTestdb")
    DataSource dsTestdb;

    @Bean
    SqlSessionFactory sqlSessionFactory1() {
        SqlSessionFactory sessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(dsTestdb);
            sessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1() {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}