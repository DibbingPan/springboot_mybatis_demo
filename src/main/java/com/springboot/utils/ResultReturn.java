package com.springboot.utils;

import java.io.Serializable;

/**
 * 文件名：ResultReturn.java
 *
 * @create 2018-03-22 15:57
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限责任公司(http://www.richfit.com)
 * Copyright  2017 Richfit Information Technology Co., LTD. All Right Reserved.
 */
public class ResultReturn implements Serializable {
    private boolean success;
    private String message;
    private Object data;
    public ResultReturn(boolean success, String message, Object data){
        this.message = message;
        this.success = success;
        this.data = data;
    }
    public ResultReturn(boolean success, String message){
        this.message = message;
        this.success = success;
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
