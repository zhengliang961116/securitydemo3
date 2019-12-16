package com.zhsw.securitydemo3.service;

import com.zhsw.securitydemo3.entity.Clients;
import com.zhsw.securitydemo3.mapper.ClientsMapper;
import com.zhsw.securitydemo3.utils.Util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;



/**
 * @Author: zhengliang
 * @Description: 授权客户端校验
 * @Date: 2019/12/12 15:57
 */
@Service
public class MyClientDetailService implements ClientDetailsService{
    @Resource
    private ClientsMapper clientsMapper;
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        if (clientId==null||clientId.trim().length()<=0) {
          throw new ClientRegistrationException(" clientId 为空");
        }
        Clients clients = clientsMapper.selectClientsById(clientId);
        if (clients != null){
            return clients;
        }
        throw new ClientRegistrationException("client 客户端 不存在!");
    }

    public int saveClient(Map map) {

        map.put("clientId",Util.getUUId());
        String secret =Util.getUUId()+Util.getUUId();
        map.put("clientSecret",new BCryptPasswordEncoder().encode(secret));
        map.put("scope","all");
        map.put("authorizedGrantTypes","authorization_code,password,refresh_token");

        return   clientsMapper.saveClient(map);
    }
}
