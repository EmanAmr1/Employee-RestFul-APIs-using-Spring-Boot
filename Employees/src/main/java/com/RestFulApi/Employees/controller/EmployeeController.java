package com.RestFulApi.Employees.controller;

import com.RestFulApi.Employees.model.Employee;
import com.RestFulApi.Employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);

    }
}
