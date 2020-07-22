package com.m.eurekaclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SysPropertis {

    public static String port;

    @Value("${server.port}")
    public void setPort(String port) {
        SysPropertis.port = port;
    }
}
