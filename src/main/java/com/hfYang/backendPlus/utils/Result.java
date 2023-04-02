package com.hfYang.UserBackend.dto;

import com.hfYang.UserBackend.consant.ResultCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: user-backend
 * @description: 封装返回结果
 * @author: hfYang
 * @create: 2023-03-11 22:09
 **/


@Data
public class Result implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    //状态码
    private Integer code;

    //响应消息
    private String message;

    //响应数据
    private Object data;


    private  String description;

    public  Result(){}
    public Result(ResultCode resultCode, Object data) {
        this.code=resultCode.getCode();
        this.message=resultCode.getMsg();
        this.data=data;
    }
    public Result(ResultCode resultCode) {
        this.code=resultCode.getCode();
        this.message=resultCode.getMsg();

    }
    public Result(ResultCode resultCode, String description) {
        this.code=resultCode.getCode();
        this.message=resultCode.getMsg();
        this.description = description;
    }
    public Result(Integer code,String msg,Object data) {
        this.code=code;
        this.message=msg;
        this.data=data;
    }
    public Result(Integer code,String msg,Object data,String description) {
        this.code=code;
        this.message=msg;
        this.data=data;
        this.description = description;
    }
    public static Result success(Object data){
        return new Result(ResultCode.SUCCESS,data);
    }
    public static Result error(ResultCode resultCode,String description){
        return new Result(resultCode,description);
    }

    public static Result error(ResultCode resultCode){
        return new Result(resultCode);
    }

    public static Result success(){
        return  new Result(ResultCode.SUCCESS);
    }
    public static Result success(Integer code, String message, Object data,String description){
        return  new Result(code,message,data,description);
    }
}