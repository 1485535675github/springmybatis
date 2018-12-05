package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.mapper")
@SpringBootApplication
public class SpringmybatisApplication  {

    public static void main(String[] args){
        System.out.println("-----------------");
        SpringApplication.run(SpringmybatisApplication.class, args);
    }
}
