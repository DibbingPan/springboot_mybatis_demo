package com.springboot.utils.exception;

import com.alibaba.fastjson.JSON;
import com.springboot.utils.ResultReturn;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 文件名： GlobalExceptionHandler
 * <p>
 * <p> 全局异常处理器
 * <p>
 * 北京中油瑞飞信息技术有限公司（http://www.richfit.com）
 * Copyright 2017 Richfit Information Technolagy Co., LTD. All Right Reserved.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = DescException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, DescException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<String>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultReturn defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        String msg;
        if(e instanceof DescException){
            msg = e.getMessage();
        }else{
            msg="操作失败";
        }
        System.out.println("-------------------->全局异常处理器");
        return new ResultReturn(false,msg,req.getRequestURL().toString());
    }
}
