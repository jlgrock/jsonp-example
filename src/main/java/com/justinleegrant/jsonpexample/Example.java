package com.justinleegrant.jsonpexample;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@ComponentScan
@RestController
public class Example {

    private static Log LOGGER = LogFactory.getLog(Example.class);

    @RequestMapping("/")
    public Map home() {
        LOGGER.info("Processing home/index request.  Returning map object.");
        return new HashMap<String, String>(){{
            put("test", "Hello World!");
        }};
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}