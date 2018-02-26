package com.dudu.core.utils;

import com.dudu.core.dto.Result;

public class ResultUtils {
    public static final String SUCCESS="success";
    public static final int SUCCESS_CODE=0;
    public static Result success(Object data){
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS);
        result.setData(data);
        return  result;
    }
    public static Result success(){
        return  success(null);
    }
    public static Result error(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return  result;
    }
}
