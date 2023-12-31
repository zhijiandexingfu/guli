package com.atguigu.guli.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.guli.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:56:16
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

