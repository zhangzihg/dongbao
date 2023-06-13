package com.zzh.dongbao.protal.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.zzh"})
@Slf4j
public class MsbDongbaoProtalWeb {
    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoProtalWeb.class, args);
    }
}
