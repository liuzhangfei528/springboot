package com.qianfneg.springbootmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Aix
 * @date 2019/7/30
 **/
@RestController
@RequestMapping("log")
@Slf4j
public class LogController {

   // private Logger log= LoggerFactory.getLogger(LogController.class);

    @RequestMapping("outlog")
    public String outLog(){
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "ok";
    }
}
