package com.justinleegrant.jsonpexample.configuration;

import com.justinleegrant.jsonpexample.filters.JsonpCallbackFilter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    private static Log logger = LogFactory.getLog(AppConfig.class);

    JsonpCallbackFilter jsonpFilter = new JsonpCallbackFilter();

    @Bean
    public FilterRegistrationBean jsonpFilter() {
        logger.info("Setting up jsonpFilter with " + jsonpFilter.toString());
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(jsonpFilter);
        return filterRegBean;
    }
}
