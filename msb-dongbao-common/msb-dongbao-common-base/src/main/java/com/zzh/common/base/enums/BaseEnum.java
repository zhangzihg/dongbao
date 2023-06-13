package com.zzh.common.base.enums;

import org.springframework.util.StringUtils;

/**
 * todo 枚举类通用码值映射还没做，后续再搞
 */
public interface BaseEnum {
    /**
     * 获取枚举的code
     * @return
     */
    Integer getCode();

    /**
     * 获取枚举的msg信息
     * @return
     */
    String getMsg();

    /**
     * 通过枚举类型和code值获取对应的枚举类型
     * @param enumType
     * @param code
     * @param <T>
     * @return
     */
    static <T extends  BaseEnum>  T valueOf(Class<? extends BaseEnum> enumType,Integer code){
        if(enumType == null || code == null){
            return null;
        }

        T[] enumConstants = (T[]) enumType.getEnumConstants();

        if(null == enumConstants){
            return null;
        }

        for (T enumConstant : enumConstants) {
            if(code.equals(enumConstant.getCode()) ){
                return enumConstant;
            }
        }
        return null;
    }

    static <T extends BaseEnum> T msgOf(Class<? extends BaseEnum> enumType,String msg){
        if(enumType == null || !StringUtils.hasText(msg)){
            return null;
        }

        T[] enumConstants = (T[]) enumType.getEnumConstants();

        if(null == enumConstants){
            return null;
        }

        for (T enumConstant : enumConstants) {
            if(msg.equals(enumConstant.getMsg()) ){
                return enumConstant;
            }
        }
        return null;
    }

}
