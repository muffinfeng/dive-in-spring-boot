package com.imooc.web.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * {@link HelloWorldController} 通知
 * 几种常用注解
 * @ControllerAdvice
 * @ModelAttribute
 * @RequestHeader
 * @CookieValue
 * @ExceptionHandler
 */


@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {
    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue("JSESSIONID") String jsessionId){
        return jsessionId;
    }

    @ModelAttribute("message")
    public String message(){
        return "helloworld";
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable throwable){

        return ResponseEntity.ok(throwable.getMessage());
    }
}
