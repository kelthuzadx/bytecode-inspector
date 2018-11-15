package com.github.racaljk.bytecodeinspector.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = {"/","/step1","/index"})
    public String index(){
        return "index";
    }
}
