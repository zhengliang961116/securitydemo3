package com.zhsw.securitydemo3.mapper;

import com.zhsw.securitydemo3.entity.Clients;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @Author: zhengliang
 * @Description: 客户端接口
 * @Date: 2019/12/12 15:51
 */
@Mapper
public interface ClientsMapper {
     Clients  selectClientsById(@Param("clientId") String clientId);

     int saveClient(Map map);
}
