package com.m.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.io.File;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    //    findFile("D:\\projects\\springcloud_rpc");
    }


//    private static final String startClassLastName = "Application.java";
//
//    private static void findFile(String filePath){
//        File rpcFile = new File(filePath);
//        File[] rpcFiles = rpcFile.listFiles();
//        for(File file : rpcFiles){
//            if(!".git".equals(file.getName())){
//                if(file.isDirectory()){
//                    findFile(file.getPath());
//                }else{
//                    //不是文件夹，查询是否启动类
//                    String fileName = file.getName();
//                    if(fileName.length() > startClassLastName.length() &&
//                            startClassLastName.equals(fileName.substring(fileName.length()-startClassLastName.length(),fileName.length()))){
//                        System.err.println(file.getName());
//                    }
//                }
//            }
//        }
//    }



}
