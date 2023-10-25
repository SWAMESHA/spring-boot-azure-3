package com.springbootazure2.springbootazure2.controller;

import com.springbootazure2.springbootazure2.entity.Employee;
import com.springbootazure2.springbootazure2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/azure")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee created(@RequestBody Employee employee){
       return employeeService.created(employee);
    }

    @GetMapping
    public List<Employee> gettingData(){
     return   employeeService.gettingData();
    }


}
