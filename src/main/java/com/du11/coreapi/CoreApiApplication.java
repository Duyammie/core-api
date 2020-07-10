package com.du11.coreapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EntityScan({"com.du11.coreapi.entity"})
@SpringBootApplication(scanBasePackages = "com.du11.coreapi", exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = "com.du11.coreapi")
public class CoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApiApplication.class, args);
    }

}