package com.qianfeng.springboothello.listener;

import org.springframework.stereotype.Component;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@Component
public class MyListener implements ServletRequestListener{

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.err.println("MyListener destroy...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.err.println("MyListener init....");
    }


}