package com.driver.service.controller;

import com.driver.service.dto.DriverDTO;
import com.driver.service.entity.Driver;
import com.driver.service.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/driver")
@RestController
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @GetMapping("/get-all")
    public List<Driver> getAllAvailableDrivers(){
        return driverService.getAllDrivers();
    }

    @PostMapping
    public Driver addDriver(@RequestBody DriverDTO driverDTO){
        return driverService.saveDriver(driverDTO);
    }

}
