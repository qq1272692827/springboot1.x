package com.btm.commonapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenzhenyu
 * @description 底层控制器测试
 * @date 2018/11/28
 */
@RestController
//@RequestMapping("/commonapi/")
public class TestCotroller {

    @RequestMapping("test")
    public String out(){
        System.out.println("什么情况");
        return "commonapi-remote -test";
    }

}
