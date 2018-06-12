package com.zl.domain;

/**
 * http请求返回的最外层对象
 * Created by ef on 2018/6/12.
 */
public class Result<T> {
    private  Integer code;

    private  String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }
}
