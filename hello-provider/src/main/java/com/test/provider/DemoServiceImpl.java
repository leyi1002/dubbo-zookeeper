package com.test.provider;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/2/1.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {


    public String sayHello(String word) {
        return "hello " + word + ",I'm provider \r\n";
    }
}
