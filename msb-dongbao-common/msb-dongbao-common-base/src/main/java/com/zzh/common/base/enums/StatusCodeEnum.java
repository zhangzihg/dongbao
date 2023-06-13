package com.zzh.common.base.enums;

public enum  StatusCodeEnum {
    OK(6666,"请求成功"),
    FAIL(6667,"请求失败"),
    NULLPOINT_EX(6668,"空指针异常"),
    Arithmetic_EX(6669,"算数异常"),
    USERNAME_EXISTS(1000,"用户名已经存在"),
    TOKEN_EXPORED(1001,"token已经失效"),
    PASSWORD_CHK(100,"用户名或者密码不正确");

    private int code;
    private String msg;

    StatusCodeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
