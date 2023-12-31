package com.atguigu.member.gulimemebr.dao;

import com.atguigu.member.gulimemebr.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:20:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
