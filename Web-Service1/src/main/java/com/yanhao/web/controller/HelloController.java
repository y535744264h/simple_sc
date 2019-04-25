package com.yanhao.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    private final Logger logger= Logger.getLogger(getClass());

    @Autowired
    private org.springframework.cloud.client.discovery.DiscoveryClient client;

    @RequestMapping("/hello")
    public String index(){
        ServiceInstance instance=client.getLocalServiceInstance();
        logger.info("/hello host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello World";
    }
}
