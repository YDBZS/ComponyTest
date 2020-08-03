package com.example.Result;

import lombok.Data;

@Data
public class  ReturnResult {

    private final


    //状态码
    private String code;

    //返回信息
    private String msg;

    private Object data;

    public static <T> ReturnResult ok(T data){
        return new ReturnResult(data);
    }


    public ReturnResult(Object data) {
        this.code = "200";
        this.msg = "成功";
        this.data = data;
    }
}
