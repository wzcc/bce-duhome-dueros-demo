package com.baidubce.iot.duhome.demo.config;

import ch.qos.logback.access.servlet.TeeFilter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {
    @Bean
    public FilterRegistrationBean teeFilter(){
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        // TeeFilter used to log requestContent & responseContent
        filterRegBean.setFilter(new TeeFilter());
        return filterRegBean;
    }
}