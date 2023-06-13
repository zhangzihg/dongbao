package com.zzh.dongbao.protal.web.advice;

import com.zzh.common.base.result.ResultWarpper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

/**
 * 参数校验处理
 * @author zhangzihang
 */
//@ControllerAdvice
@Slf4j
public class ValidateHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.debug("jjjj");
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        StringBuffer sb = new StringBuffer();

        for (FieldError fieldError : fieldErrors) {
            sb.append(fieldError.getDefaultMessage());
        }
        return new ResponseEntity<>(ResultWarpper.setSuccessResult().data(sb.toString()).build(),HttpStatus.OK);
    }

    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        logger.debug("jjjj");
        List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
        StringBuffer sb = new StringBuffer();

        for (FieldError fieldError : fieldErrors) {
            sb.append(fieldError.getDefaultMessage());
        }
        return new ResponseEntity<>(ResultWarpper.setSuccessResult().data(sb.toString()).build(),HttpStatus.OK);
    }
}
