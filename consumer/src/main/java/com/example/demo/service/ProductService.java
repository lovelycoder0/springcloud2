package com.example.demo.service;

import com.example.demo.bean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    public List<Product> getProducts(){
        ServiceInstance si=loadBalancerClient.choose("demo_producer");

        StringBuffer sb=new StringBuffer();
        sb.append("http://").append(si.getHost()).append(":").append(si.getPort()).append("/test").append("/getProducts");

        RestTemplate rt=new RestTemplate();

        ParameterizedTypeReference<List<Product>> type=new ParameterizedTypeReference<List<Product>>() {
        };

        ResponseEntity<List<Product>> response=rt.exchange(sb.toString(), HttpMethod.GET,null,type);
        List<Product> list=response.getBody();

        return list;
    }
}
