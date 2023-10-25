package com.springbootazure2.springbootazure2.serviceImpl;

import com.springbootazure2.springbootazure2.entity.Employee;
import com.springbootazure2.springbootazure2.repository.EmployeeRepository;
import com.springbootazure2.springbootazure2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee created(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> gettingData() {
        return employeeRepository.findAll();
    }
}
