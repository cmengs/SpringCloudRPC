package com.m.eurekaclient.service;

import com.m.eurekaclient.config.SysPropertis;
import org.springframework.stereotype.Service;

@Service
public class DefaultServiceImpl implements DefaultService{

    @Override
    public String serviceDescription(String requestInfo) {
        return "hi,this is springcloud rpc client server port:"+ SysPropertis.port + "请求信息:"+requestInfo;
    }
}
