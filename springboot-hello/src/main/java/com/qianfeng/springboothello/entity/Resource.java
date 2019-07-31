package com.qianfeng.springboothello.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@Component
@ConfigurationProperties(prefix = "resource")
public class Resource {

    /*@Value("${imageServer.path}")
    private String imageServer;
    @Value("${emailServer.path}")
    private String emailServer;*/

    //要跟配置文件的名称一致
    private String imageServer;
    private String emailServer;

    public String getImageServer() {
        return imageServer;
    }

    public void setImageServer(String imageServer) {
        this.imageServer = imageServer;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public void setEmailServer(String emailServer) {
        this.emailServer = emailServer;
    }
}
