package com.zzh.dongbao.protal.web.advice;

import com.zzh.common.base.result.ResultWarpper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@Slf4j
public class BussinessExceptionHanldle extends GolbalExceptionHandle{
    /**
     * 处理参数校验异常效果等同于VaildateHandler类的处理
     * @param ex
     * @return
     */
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResultWarpper handleVaildateException(MethodArgumentNotValidException ex){
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        StringBuffer sb = new StringBuffer();

        for (FieldError fieldError : fieldErrors) {
            sb.append(fieldError.getField() + "-" + fieldError.getDefaultMessage()+",");
        }
        String substring = sb.toString().substring(0, sb.length() - 1);
        return ResultWarpper.setSuccessResult().data(substring).build();
    }
}
