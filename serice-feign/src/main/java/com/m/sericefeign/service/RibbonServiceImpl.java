package com.m.sericefeign.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonServiceImpl implements RibbonService {

    //启动类中注入了此模板，并且开启了负载均衡功能
    @Autowired
    RestTemplate restTemplate;

    //给方法添加熔断器的功能，并指定熔断方法
    @HystrixCommand(fallbackMethod = "erroCompany")
    @Override
    public String getCompany(String requestInfo) {
        //程序名替代服务地址，ribbon会根据服务名自动选择服务实例
        String company = restTemplate.getForObject("http://rpc-service/index?requestInfo=" + requestInfo, String.class);
        return company;
    }

    /**熔断方法*/
    public String erroCompany(String requestInfo){
        return "服务出错：请求信息："+requestInfo;
    }

}
