package com.account;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.account.item.mapper")
public class Account2Application {
    public static void main(String[] args) {
        SpringApplication.run(Account2Application.class,args);
    }
}
