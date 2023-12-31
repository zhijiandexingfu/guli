package com.atguigu.guli.ware.dao;

import com.atguigu.guli.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:56:16
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
