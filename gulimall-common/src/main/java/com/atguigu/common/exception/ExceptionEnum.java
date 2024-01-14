package com.atguigu.common.exception;

public enum ExceptionEnum {
    GENERAL_ERR(10000,"通用异常"),
    VALIDATE_ERR(10001,"参数异常");
    private int code;
    private String desc;

    ExceptionEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
