package com.zhsw.securitydemo3.controller;

import com.zhsw.securitydemo3.entity.Clients;
import com.zhsw.securitydemo3.mapper.ClientsMapper;
import com.zhsw.securitydemo3.service.MyClientDetailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: zhengliang
 * @Description: 客户端管理类
 * @Date: 2019/12/13 10:57
 */
@RestController
public class ClientsController {
    @Resource
    private MyClientDetailService  myClientDetailService;
    @PostMapping("/oauth/client/save")
    public  String  save(@RequestBody Map map){
       int  num = myClientDetailService.saveClient(map);
       return num+"";
    }
}
