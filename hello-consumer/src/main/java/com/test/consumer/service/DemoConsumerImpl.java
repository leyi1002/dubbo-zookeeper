package com.test.consumer.service;

import com.test.provider.DemoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/22.
 */
@Component
public class DemoConsumerImpl implements DemoConsumer {

    @Resource(name = "demoService")
    private DemoService provider;

    @Override
    public String returnSay(String str) {

        return provider.sayHello(str);
    }
}
