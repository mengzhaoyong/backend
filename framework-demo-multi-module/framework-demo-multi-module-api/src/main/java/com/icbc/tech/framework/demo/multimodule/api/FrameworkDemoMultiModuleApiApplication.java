package com.icbc.tech.framework.demo.multimodule.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class, scanBasePackages = {"com.icbc.tech.framework.demo.multimodule"})
@MapperScan(value = {"com.icbc.tech.framework.demo.multimodule.test.dao"})
@EnableTransactionManagement
public class FrameworkDemoMultiModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkDemoMultiModuleApiApplication.class, args);
    }

}
