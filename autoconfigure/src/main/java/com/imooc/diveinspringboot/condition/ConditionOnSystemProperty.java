package com.imooc.diveinspringboot.condition;

//Java系统属性条件判断

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionOnSystemProperty {

    //Java系统属性名称
    String name();


    //java系统属性值
    String value();
}
