package com.aixiyou.meethaoweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllernew {
    @RequestMapping("ge")
    @ResponseBody
    public String gege(){
        return "12";
    }
}
