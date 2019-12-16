package com.zhsw.securitydemo3.utils;

import java.util.UUID;

/**
 * @Author: zhengliang
 * @Description: 工具类
 * @Date: 2019/12/13 11:13
 */
public class Util {
    /**
     * uuid生成工具
     * @return
     */
    public static String getUUId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
