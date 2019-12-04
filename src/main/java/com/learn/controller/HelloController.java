package com.learn.controller;

import com.learn.annotation.RpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: applicationcontext
 * @description:
 * @author: zjj
 * @create: 2019-12-04 16:44
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test1(){
        return "hello";
    }
}
