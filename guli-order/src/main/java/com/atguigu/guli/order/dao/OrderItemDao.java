package com.atguigu.guli.order.dao;

import com.atguigu.guli.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:45:14
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
