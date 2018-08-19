package com.qiyu.passbook.merchants;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * <h1>test entrance</h1>
 * Created by Qiyu.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.qiyu.passbook.merchants.service.impl")
public class MerchantsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantsApplication.class, args);
    }
}
