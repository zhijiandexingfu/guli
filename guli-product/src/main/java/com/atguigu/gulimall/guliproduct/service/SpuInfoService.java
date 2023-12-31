package com.atguigu.gulimall.guliproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.guliproduct.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-30 17:16:46
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

