package com.yanhao.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/ribbon-consumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://WEB-SERVICE1/hello",String.class).getBody();
    }
}
