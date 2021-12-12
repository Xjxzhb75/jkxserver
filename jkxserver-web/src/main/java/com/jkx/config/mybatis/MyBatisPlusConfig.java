package com.jkx.config.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xinjianxun
 * @version 1.0
 * @description: mybatis plus 配置类
 * @date 2021/12/13 0:35
 */
@Configuration
@MapperScan("com.jkx.*.*.mapper")
public class MyBatisPlusConfig {
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.ORACLE_12C));
        return interceptor;
    }
}
