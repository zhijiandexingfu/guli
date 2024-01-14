package com.atguigu.gulimall.guliproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.guliproduct.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-30 17:16:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> getMenulist();

    void deleteByIds(List<Long> asList);
}

