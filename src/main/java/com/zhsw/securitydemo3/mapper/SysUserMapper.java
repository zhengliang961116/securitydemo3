package com.zhsw.securitydemo3.mapper;

import com.zhsw.securitydemo3.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: zhengliang
 * @Description: 用户dao层
 * @Date: 2019/12/12 17:10
 */
@Mapper
public interface SysUserMapper {
    SysUser selectByUserName(@Param("username") String username);
}
