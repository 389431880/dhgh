package com.dhgh.dhghdoor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = {"com.dhgh.*"})
@MapperScan(value = "com.dhgh.dhghdb.dao.mapper")
@EnableAsync
public class DhghDoorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DhghDoorApplication.class, args);
    }

}
