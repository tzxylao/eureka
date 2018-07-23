package com.tzxylao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 */
@Controller
public class App {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(@RequestParam(value="name",required=false) String name){
        return name;
    }
}
