package com.imooc.web.config;


//spring web mvc 配置

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc  //代替app-context.xml里的HandlerMapping，HandlerAdapter
public class WebMvcConfig {

    @Bean
    public ViewResolver viewResolver(){       //代替app-context.xml里的HandlerMapping，InternalResourceViewResolver
        InternalResourceViewResolver viewResolver = new  InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

}
