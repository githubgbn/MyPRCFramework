package com.rpc.test;

import com.rpc.api.HelloObject;
import com.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject helloObject) {
        logger.info("接收到: {}", helloObject.getMessage());
        return "这是掉用的返回值，id=" + helloObject.getId();
    }
}
