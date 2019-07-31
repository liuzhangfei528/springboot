package com.qianfneg.springbootmybatis.exception;

import com.qianfneg.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
