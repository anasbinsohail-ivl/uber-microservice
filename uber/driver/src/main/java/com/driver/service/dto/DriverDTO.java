package com.driver.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DriverDTO {
    private Long id;
    private String fullName;
    private String mobile;
}
