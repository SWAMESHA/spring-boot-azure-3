package com.springbootazure2.springbootazure2.service;

import com.springbootazure2.springbootazure2.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee created(Employee employee);

    List<Employee> gettingData();
}
