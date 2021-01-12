package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("greeting","helloWorld");
        return "helloworld";
    }
}
