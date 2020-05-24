package com.example.demo.controller;

import com.example.demo.bean.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lenovo
 */
@RestController
@RequestMapping("/testConsumer")
public class ConsumerController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/consumer")
    @ResponseBody
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
