package com.praveen.shethe.AdministratorSupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AdministratorSupportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdministratorSupportApplication.class, args);
    }
}
