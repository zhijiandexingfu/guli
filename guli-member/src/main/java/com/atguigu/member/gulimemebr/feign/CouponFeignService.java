package com.atguigu.member.gulimemebr.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/gulicoupon/coupon/member/list")
    public R memberCoupons();

}
