package com.test.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/2/1.
 */
public class ProviderMain {

    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext context =
                    new ClassPathXmlApplicationContext("cconf/application.xml");
            context.start();
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
