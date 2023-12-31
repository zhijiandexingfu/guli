package com.atguigu.gulimall.guliproduct;

import com.atguigu.gulimall.guliproduct.entity.BrandEntity;
import com.atguigu.gulimall.guliproduct.service.BrandService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Test;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GuliProductApplicationTests {
	@Autowired
	BrandService brandService;
	@Test
	public void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("华为");
		brandService.save(brandEntity);
		System.out.println("save successful");
	}

}
