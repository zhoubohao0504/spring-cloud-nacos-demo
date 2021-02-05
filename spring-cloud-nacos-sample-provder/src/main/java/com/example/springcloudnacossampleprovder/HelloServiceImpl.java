package com.example.springcloudnacossampleprovder;

import org.apache.dubbo.config.annotation.Service;
import org.example.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello World,"+name;
    }
}
