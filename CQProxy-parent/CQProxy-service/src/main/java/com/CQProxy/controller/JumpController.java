package com.CQProxy.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

    @RequestMapping("test")
    public String jump(){
        return "test";
    }
    @RequestMapping("test3")
    public String jump3(){
        return "test3";
    }
    @RequestMapping("t6")
    public String jump5(){
        return "t6";
    }


}
