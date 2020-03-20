package com.lf.yapin.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.lf.yapin.pms.mapper")
@EnableDubbo
@SpringBootApplication
public class YapinPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YapinPmsApplication.class, args);
    }

}
