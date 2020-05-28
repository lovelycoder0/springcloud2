package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author lenovo
 */
@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMsg")
    public String consumer() {
        // 调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
        restTemplate.getForObject("http://hello-service/hello", String.class);
        return "hello consumer finish !!!";
    }

    public String errorMsg() {
        return "error!!!";
    }
}
