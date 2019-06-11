package com.imooc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String index(@RequestParam int p, Model model){
        //model.addAttribute("acceptLanguage",acceptLanguage);
        //model.addAttribute("jsessionId",jsessionId);
        return "index";
    }


}
