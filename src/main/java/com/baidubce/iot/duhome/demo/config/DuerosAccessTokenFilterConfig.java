package com.baidubce.iot.duhome.demo.config;

import com.baidubce.iot.duhome.demo.dueros.filter.DuerosAccessTokenFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuerosAccessTokenFilterConfig {

    @Bean
    public FilterRegistrationBean duerosAccessTokenFilter(){
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        //filterRegBean.addUrlPatterns("/api/bot");
        filterRegBean.setFilter(new DuerosAccessTokenFilter());
        filterRegBean.setOrder(Integer.MIN_VALUE);
        return filterRegBean;
    }
}