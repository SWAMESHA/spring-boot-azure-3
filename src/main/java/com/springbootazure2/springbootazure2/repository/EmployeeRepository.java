package com.springbootazure2.springbootazure2.repository;

import com.springbootazure2.springbootazure2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
