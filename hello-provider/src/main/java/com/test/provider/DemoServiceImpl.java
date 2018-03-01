package com.test.provider;

import com.alibaba.dubbo.container.spring.SpringContainer;
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
