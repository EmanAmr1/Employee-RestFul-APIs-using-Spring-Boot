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


    public List<Employee> getDeptEmps (long deptId){
       return employeeRepository.findByDepartmentId(deptId);

    }





    //RETURN LIST OF EMPLOYEES
    public List<Employee> getAllEmployees(){
        return  employeeRepository.findAll();
    }


    public  List<Employee> getEmployeesByFirstName(String firstName){
        return employeeRepository.findByFirstName(firstName);
    }


    public List<Employee> getEmpSearch(String firstName, String lastName){
        return  employeeRepository.empSearch(firstName,lastName);
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).get();
    }



    public void deleteEmployee(long id){
      employeeRepository.deleteById(id);
    }

    public void addEmployee(Employee newEmp){
        employeeRepository.save(newEmp);
     }


     public void updateEmployee (Employee Emp){
        employeeRepository.save(Emp);
    }




}
