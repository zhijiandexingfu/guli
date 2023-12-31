package com.atguigu.member.gulimemebr.dao;

import com.atguigu.member.gulimemebr.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:20:31
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
