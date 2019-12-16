package com.zhsw.securitydemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhengliang
 * @Description: hello
 * @Date: 2019/12/13 14:18
 */
@RestController
public class HelloController {
    // 1. 可以get访问
    // http://localhost:8080/oauth/authorize?client_id=clientId&response_type=code&redirect_uri=http://localhost:8080/


    // 2. 必须post访问
    // http://localhost:8080/oauth/token?grant_type=authorization_code&code=授权码&redirect_uri=http://localhost:8080/&client_id=clientId&client_secret=secret
    @GetMapping("/oauth/user/get")
    public String get(){
        return "get demo3";
    }

}
