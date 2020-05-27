package com.mak.sbt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MaoAiKun
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
