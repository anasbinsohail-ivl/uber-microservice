package com.customer.service.controller;

import com.customer.service.dto.CustomerDTO;
import com.customer.service.entity.Customer;
import com.customer.service.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequestMapping("/customer")
@RestController
@RequiredArgsConstructor
public class CustomerController<T>{

    private final CustomerService customerService;

    @GetMapping("/get-all")
    public List<Customer> getAllCustomers(){
        RestTemplate restTemplate = new RestTemplate();
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }

    @GetMapping("/find-drivers")
    public List<T> getAllAvailableDrivers(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://localhost:9000/driver/get-all",List.class);
    }

}
