package com.m.sericefeign.open.api;

import com.m.sericefeign.service.RibbonService;
import com.m.sericefeign.service.SchedualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenAPI {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(@RequestParam String requestInfo){
        return ribbonService.getCompany(requestInfo);
    }

//    @Autowired
//    private SchedualService schedualService;

//    @RequestMapping(value = "/index",method = RequestMethod.GET)
//    public String index(@RequestParam String requestInfo){
//        return schedualService.serviceDescription(requestInfo);
//    }
}
