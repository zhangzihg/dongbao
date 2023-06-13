package com.zzh.common.base.enums;

import java.io.Serializable;

/**
 * 枚举类型，入参，如果枚举是int类型数字则：
 * 0：代表第一个枚举对象 FMALE；1:代表第二个枚举类型对象MALE；以此类推
 * 如果枚举是字符串，就必须写枚举对象的名字，这里是“FMALE” “MALE”
 */
public enum SexEnum implements Serializable {
    FMALE(0,"女"),
    MALE(1,"男");
    private int code;
    private String msg;
    SexEnum(int code,String msg){
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

    public static SexEnum getMsgByCode(int code){
        SexEnum[] values = SexEnum.values();
        for (SexEnum value : values) {
            if(value.code == code){
                return value;
            }
        }
        return null;
    }

}
