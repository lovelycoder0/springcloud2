package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *这里不再直接调用restTemplate，
 *而是通过调用service进行实现
 *
 * @author lenovo
 */
@RestController
public class ConsumerController {

    @Autowired
    ConsumerService service;


    @RequestMapping("/hello-consumer")
    public String helloConsumer() {
        return service.consumer();
    }
}