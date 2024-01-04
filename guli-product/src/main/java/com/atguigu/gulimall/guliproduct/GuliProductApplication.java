package com.atguigu.gulimall.guliproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.guliproduct.dao")
public class GuliProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliProductApplication.class, args);
	}

}
