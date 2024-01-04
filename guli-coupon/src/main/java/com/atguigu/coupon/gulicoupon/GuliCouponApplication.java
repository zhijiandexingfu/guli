package com.atguigu.coupon.gulicoupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuliCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuliCouponApplication.class, args);
	}

}
