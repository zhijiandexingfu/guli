package com.atguigu.member.gulimemebr.controller;

import java.util.Arrays;
import java.util.Map;

import com.atguigu.member.gulimemebr.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.member.gulimemebr.entity.MemberEntity;
import com.atguigu.member.gulimemebr.service.MemberService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 会员
 *
 * @author zenghanghang
 * @email zenghanghang@gmail.com
 * @date 2023-12-31 18:20:31
 */
@RestController
@RequestMapping("gulimemebr/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeignService couponFeignService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }

    @RequestMapping("/get/memberCoupouns")
    public R getMemberCoupouns(){
        R res = couponFeignService.memberCoupons();
        MemberEntity member = new MemberEntity();
        member.setNickname("张三");
        return R.ok().put("member", member).put("coupons",res.get("coupons"));
    }
/**/


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
