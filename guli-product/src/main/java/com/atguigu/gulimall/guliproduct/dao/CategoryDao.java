package com.atguigu.gulimall.guliproduct.dao;

import com.atguigu.gulimall.guliproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-30 17:16:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
