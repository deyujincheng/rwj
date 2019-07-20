package com.rwj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * HELLOW WORLD
 * @author chichenglong
 * @date 2019/6/19 13:31
 */

@SpringBootApplication
@ImportResource({ "classpath:config/*.xml","classpath:mapper/*.xml"})
@ComponentScan(basePackages = {"com.rwj"})
@MapperScan("com.rwj.mapper") //扫描的mapper
public class ProviderDemoApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderDemoApp.class, args);
    }
}
