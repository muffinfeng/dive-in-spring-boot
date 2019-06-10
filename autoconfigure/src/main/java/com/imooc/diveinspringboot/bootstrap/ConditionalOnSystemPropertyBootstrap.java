package com.imooc.diveinspringboot.bootstrap;


import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

//条件装配
//系统属性条件引导类

public class ConditionalOnSystemPropertyBootstrap {

    @Bean
    @ConditionOnSystemProperty(name="user.name",value="CFDA")
    public String helloWorld(){
        return "hello,小冯";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //通过名称类型获得helloworldbean
        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloworldBean :" +helloWorld);


        context.close();
    }
}
