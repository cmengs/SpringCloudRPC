package com.m.sericeribbon.open.api;

import com.m.sericeribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAPI {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping(value = "/index")
    public String getCompany(String id){
        String company = ribbonService.getCompany(id);
        System.out.println(company);
        return company;
    }
}
