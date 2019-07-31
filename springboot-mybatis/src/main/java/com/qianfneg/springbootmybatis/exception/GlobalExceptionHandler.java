package com.qianfneg.springbootmybatis.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qianfneg.springbootmybatis.entity.ResultBean;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Aix
 * @date 2019/7/30
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean exceptionHandle(){
        return new ResultBean("滚","你不配访问这个页面");
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ResultBean validationErrorHandler(BindException ex) throws JsonProcessingException {
        //获取bindingResult
        BindingResult bindingResult = ex.getBindingResult();
        //获取错误信息
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        //组装异常信息
        Map<String,String> message=new HashMap<>();
        for (FieldError fieldError : fieldErrors) {
            message.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        //map转换为json
        ObjectMapper objectMapper=new ObjectMapper();
        String json = objectMapper.writeValueAsString(message);

        return new ResultBean("400",json);
    }
}
