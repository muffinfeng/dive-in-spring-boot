package com.imooc.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {

    @RequestMapping("")
    public String index(@RequestParam(required = false,defaultValue = "0") int p, Model model){

        return "index";
    }

    @GetMapping("/hello-world")
    public String helloWorld(){

        return "hello-world";
    }

    @ModelAttribute("message")
    public String message(){
        return "HelloWorld";
    }
}
