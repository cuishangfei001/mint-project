package com.tcbd07.mintproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tcbd07.mintproject.dao")
public class MintProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MintProjectApplication.class, args);
    }

}
