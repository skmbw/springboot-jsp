package com.hellokoding.springboot;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yinlei
 * @since 17-11-12 下午12:17
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean demoFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        DemoFilter filter = new DemoFilter();
        bean.setFilter(filter);
        return bean;
    }
}
