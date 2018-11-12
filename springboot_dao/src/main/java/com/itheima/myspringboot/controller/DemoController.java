package com.itheima.myspringboot.controller;

import com.itheima.myspringboot.result.CodeMsg;
import com.itheima.myspringboot.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public String home(){
        return "hello world";
    }
    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello(){
        return Result.success("helloSpringBoot");
    }
    @RequestMapping("/error")
    @ResponseBody
    public Result<String> error(){
        return Result.error(CodeMsg.SERVER_ERROR);
    }
}
