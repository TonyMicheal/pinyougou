package com.itheima.myspringboot.result;

public class CodeMsg {
    private int code;
    private String msg;
    //通用的异常
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg  SERVER_ERROR = new CodeMsg(50010,"服务端异常");
    //登录模块

    //商品模块

    //订单模块

    //秒杀模块

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }



    public String getMsg() {
        return msg;
    }


}
