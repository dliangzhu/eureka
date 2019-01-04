package com.eureka.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dengl
 * @Date: 2019/1/3 14:06
 * @Description:
 */
@RestController
public class Provider {
    @GetMapping("/provide")
    @ResponseBody
    public String user(@RequestParam Integer id){
        return "product:"+id +" from A";
    }
}
