package com.m.sericefeign.service;

/**
 * 配置断路器service
 */
public interface RibbonService {

    String getCompany(String requestInfo);
}
