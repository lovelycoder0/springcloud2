package com.example.demo.controller;

import com.example.demo.bean.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class ProducerController {

    @RequestMapping(value = "/getProducts",method = RequestMethod.GET)
    public List<Product> getProducts(){
        List<Product> list=new ArrayList<>();
        Product p1=new Product("香蕉",200);
        Product p2=new Product("苹果",300);
        list.add(p1);
        list.add(p2);
        return list;
    }
}
