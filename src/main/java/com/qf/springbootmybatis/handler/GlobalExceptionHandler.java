package com.qf.springbootmybatis.handler;

import com.qf.springbootmybatis.entity.ResultBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author xiebin
 * @Date ${Date}
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultBean<String> handlerException(Exception exception){
        exception.printStackTrace();
        return new ResultBean("404","稍后再操作");
    }

}
