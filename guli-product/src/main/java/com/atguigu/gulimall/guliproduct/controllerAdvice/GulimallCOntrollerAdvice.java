package com.atguigu.gulimall.guliproduct.controllerAdvice;

import com.atguigu.common.exception.ExceptionEnum;
import com.atguigu.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ValidationException;
import java.util.HashMap;

@RestControllerAdvice(basePackages = "com.atguigu.gulimall.guliproduct.controller")
@Slf4j
public class GulimallCOntrollerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R paramExceptionHandler(MethodArgumentNotValidException e){
        HashMap<String, String> map = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().stream()
                    .forEach((ele) -> {
                        map.put(ele.getField(), ele.getDefaultMessage());
                    });
        log.error("e.message{},error's type{}", ExceptionEnum.VALIDATE_ERR.getDesc(),ExceptionEnum.VALIDATE_ERR.getCode());
        return R.error(ExceptionEnum.VALIDATE_ERR.getCode(), ExceptionEnum.VALIDATE_ERR.getDesc()).put("data", map);
        }

    @ExceptionHandler(Throwable.class)
    public R generalExceptionHandler(Throwable e){
        log.error("e.message{},error's type{}", ExceptionEnum.GENERAL_ERR.getCode(),ExceptionEnum.VALIDATE_ERR.getDesc());
        return R.error(ExceptionEnum.GENERAL_ERR.getCode(), ExceptionEnum.GENERAL_ERR.getDesc());
    }

}
