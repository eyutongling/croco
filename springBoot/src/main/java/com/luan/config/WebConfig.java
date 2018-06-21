package com.luan.config;

import com.luan.Interceptor.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2018/2/8 0008.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor());
        registry.addInterceptor(new Interceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
        registry.addInterceptor(new Interceptor()).addPathPatterns("/secure/*");
    }
}
