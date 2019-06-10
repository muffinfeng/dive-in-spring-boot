package com.imooc.diveinspringboot.configuration;

//helloworld自动装配
import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration//Spring 模式注解
@EnableHelloWorld//Enable模块装配
@ConditionOnSystemProperty(name="user.name",value="CFDA") //条件装配
public class HelloWorldAutoConfiguration {
}
