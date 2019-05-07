package com.dhgh.dhghdb.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 鼠笑天
 * @date 2018/3/12
 */
@Configuration
@MapperScan("com.dhgh.iwork.db.dao.mapper")
public class MybatisPlusConfig {

    /**
     * 分页插件
     * 
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}