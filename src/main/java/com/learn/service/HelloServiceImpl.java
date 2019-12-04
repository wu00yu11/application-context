package com.learn.service;

import com.learn.annotation.RpcService;
import org.springframework.stereotype.Service;

/**
 * @program: applicationcontext
 * @description:
 * @author: zjj
 * @create: 2019-12-04 17:35
 **/
@RpcService
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "service hello() method";
    }
}
