package com.zzh.dongbao.usm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzh.dongbao.usm.mapper")
public class MsbDongbaoUms {
    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoUms.class,args);
    }
}
