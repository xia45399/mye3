package com.summer.mye3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SsoWeb extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SsoWeb.class, args);
    }
}
