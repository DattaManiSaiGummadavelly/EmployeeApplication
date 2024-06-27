package com.gl.EmployeeApplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @GetMapping
    ResponseEntity<String> getEmployee(){
        return new ResponseEntity<>("Hii!!Employee", HttpStatus.OK);
    }
}
