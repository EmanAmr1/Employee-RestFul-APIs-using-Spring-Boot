package com.RestFulApi.Employees.controller;

import com.RestFulApi.Employees.model.Employee;
import com.RestFulApi.Employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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


    @GetMapping("/getEmpByFirstName/{firstName}")
    public List<Employee> getEmpByFirstName(@PathVariable String firstName){
        return employeeService.getEmployeesByFirstName(firstName);
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);
    }
}
