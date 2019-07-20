package com.rwj;

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
@ImportResource({ "classpath:config/*.xml" })
@ComponentScan(basePackages = {"com.rwj"})
public class ConsumerDemoApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerDemoApp.class, args);
    }
}
