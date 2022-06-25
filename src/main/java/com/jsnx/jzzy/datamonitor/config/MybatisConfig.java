package com.jsnx.jzzy.datamonitor.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 描述：
 *
 * @Author hulei
 * @create 2020-06-15 16:49
 */
@Configuration
@MapperScan(basePackages = {"com.jsnx.jzzy.datamonitor.mapper"})
@EnableTransactionManagement(proxyTargetClass = true)
public class MybatisConfig {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
