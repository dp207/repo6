package com.CQProxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.CQProxy.mapper")
public class CQProxyApplication {
    public static void main(String[] args) {
        SpringApplication.run(CQProxyApplication.class,args);
    }
}
