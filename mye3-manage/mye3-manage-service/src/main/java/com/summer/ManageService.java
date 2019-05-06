package com.summer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.summer.manage.mapper")
public class ManageService {
    public static void main(String[] args) {
        SpringApplication.run(ManageService.class, args);
    }
}
