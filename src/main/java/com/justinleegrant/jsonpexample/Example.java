package com.justinleegrant.jsonpexample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@ComponentScan
@EnableAutoConfiguration
public class Example {

    private static Log logger = LogFactory.getLog(Example.class);

    @RequestMapping("/")
    Map home() {
        logger.info("ENTERS home...");
        return new HashMap<String, String>(){{
            put("test", "Hello World!");
        }};
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}