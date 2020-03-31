package com.zys;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootUserServiceProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProvideApplication.class, args);
    }

}
