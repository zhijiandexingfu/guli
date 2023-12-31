package com.atguigu.coupon.gulicoupon.dao;

import com.atguigu.coupon.gulicoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 17:46:09
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
