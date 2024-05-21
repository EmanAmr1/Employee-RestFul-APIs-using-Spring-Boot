package com.RestFulApi.Employees.services;

import com.RestFulApi.Employees.model.Employee;
import com.RestFulApi.Employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;


    //RETURN LIST OF EMPLOYEES
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }
}
