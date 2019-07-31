package com.qianfeng.springboothello.webconfig;

import com.qianfeng.springboothello.filter.MyFilter;
import com.qianfeng.springboothello.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@Configuration
public class WebConfig {

    @Autowired
    private MyFilter myFilter;

    @Bean
    public FilterRegistrationBean init(){
        FilterRegistrationBean filter=new FilterRegistrationBean();
        filter.setFilter(myFilter);
        filter.setName("myFilter");
        filter.addUrlPatterns("/*");
        return filter;
    }

    @Autowired
    private MyListener myListener;

    @Bean
    public ServletListenerRegistrationBean init2(){
        ServletListenerRegistrationBean listener=new ServletListenerRegistrationBean();
        listener.setListener(myListener);
        return listener;
    }

}
