package com.zzh.common.base.result;

import com.zzh.common.base.enums.StatusCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultWarpper<T> {
    private Integer code;
    private String msg;
    private T data;

    public static ResultWarpper.ResultWarpperBuilder setFailedResult(){
         return ResultWarpper.builder().code(StatusCodeEnum.FAIL.getCode()).msg(StatusCodeEnum.FAIL.getMsg());
    }

    public static ResultWarpper.ResultWarpperBuilder setSuccessResult(){
        return ResultWarpper.builder().code(StatusCodeEnum.OK.getCode()).msg(StatusCodeEnum.OK.getMsg());
    }
}
