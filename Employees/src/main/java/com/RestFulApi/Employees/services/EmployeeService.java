package com.RestFulApi.Employees.services;

import com.RestFulApi.Employees.model.Employee;
import com.RestFulApi.Employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    //RETURN LIST OF EMPLOYEES
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }


    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).get();
    }



    public void deleteEmployee(long id){
      employeeRepository.deleteById(id);
    }
}
