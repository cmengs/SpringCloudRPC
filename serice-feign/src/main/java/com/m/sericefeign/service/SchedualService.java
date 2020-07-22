package com.m.sericefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "rpc-service")
public interface SchedualService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String serviceDescription(@RequestParam String requestInfo);


}
