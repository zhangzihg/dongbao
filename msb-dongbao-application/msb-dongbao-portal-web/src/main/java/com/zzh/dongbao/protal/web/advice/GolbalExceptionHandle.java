package com.zzh.dongbao.protal.web.advice;

import com.zzh.common.base.enums.StatusCodeEnum;
import com.zzh.common.base.result.ResultWarpper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 处理一些通用异常
 */
@RestControllerAdvice
@Slf4j
public class GolbalExceptionHandle {

    @ExceptionHandler(ArithmeticException.class)
    public ResultWarpper handleException(){
        log.debug("数学异常");
        return ResultWarpper.builder().code(StatusCodeEnum.Arithmetic_EX.getCode()).msg(StatusCodeEnum.Arithmetic_EX.getMsg()).build();
    }

    @ExceptionHandler(NullPointerException.class)
    public ResultWarpper handleNullPointException(NullPointerException ex){
        ex.getMessage();
        return ResultWarpper.builder().code(StatusCodeEnum.NULLPOINT_EX.getCode()).msg(StatusCodeEnum.NULLPOINT_EX.getMsg()).build();
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResultWarpper handleDBException(SQLIntegrityConstraintViolationException exception){
        log.debug(exception.getMessage());
        return ResultWarpper.builder().code(StatusCodeEnum.USERNAME_EXISTS.getCode()).msg(StatusCodeEnum.USERNAME_EXISTS.getMsg()).build();
    }

}
