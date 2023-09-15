package com.driver.service.controller;

import com.driver.service.dto.DriverDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/driver")
@RestController
public class DriverController {

    @GetMapping("/get-all")
    public List<DriverDTO> getAllAvailableDrivers(){
        return List.of(
                new DriverDTO(1L,"Rabi Achakzai","090078601"),
                new DriverDTO(2L,"Rizwan Nurmagomedov","090078601"),
                new DriverDTO(3L,"Monis GPT5","090078601"),
                new DriverDTO(4L,"Armanullah Khalili","090078601")
        );
    }

}
