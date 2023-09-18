package com.driver.service.service;

import com.driver.service.dto.DriverDTO;
import com.driver.service.entity.Driver;
import com.driver.service.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverService {

    private final DriverRepository driverRepository;

    public List<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }

    public Driver saveDriver(DriverDTO driverDTO){
        Driver driver = new Driver();
        BeanUtils.copyProperties(driverDTO,driver);
        return driverRepository.save(driver);
    }

}
