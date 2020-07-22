package com.m.eurekaclient.open.api;

import com.m.eurekaclient.service.DefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index01OpenAPI {

    @Autowired
    private DefaultService defaultService;

    @RequestMapping("/index")
    public String index(@RequestParam String requestInfo) {
        return defaultService.serviceDescription(requestInfo);
    }
}
