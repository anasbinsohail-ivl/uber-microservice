package com.customer.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/customer")
@RestController
public class CustomerController<T>{

    @GetMapping("/get-drivers")
    public List<T> getAllAvailableDrivers(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:8082/driver/get-all", List.class);
    }

}
