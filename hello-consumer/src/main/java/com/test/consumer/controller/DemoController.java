package com.test.consumer.controller;

import com.test.consumer.service.DemoConsumerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/22.
 */
@RestController
public class DemoController {

    @Resource(name = "demoConsumerImpl")
    private DemoConsumerImpl demoConsumer;

    @RequestMapping("/dubbo-hello")
    public String sal(String str){
        return demoConsumer.returnSay(str);
    }

}
