package com.lf.yapin.ums;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.lf.yapin.ums.mapper")
public class YapinUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YapinUmsApplication.class, args);
    }

}
