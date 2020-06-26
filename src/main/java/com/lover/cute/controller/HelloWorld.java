package com.lover.cute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
    @GetMapping("/loveme")
    public String love() {
        return "loveya";
    }

    @GetMapping("/hateyou")
    public String hate(){
        return "hateya";
    }

}
