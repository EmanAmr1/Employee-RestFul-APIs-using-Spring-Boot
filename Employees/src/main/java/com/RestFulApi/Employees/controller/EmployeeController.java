package com.RestFulApi.Employees.controller;

import com.RestFulApi.Employees.model.Employee;
import com.RestFulApi.Employees.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

@GetMapping("/getDeptEmployees/{deptId}")
public List<Employee> getDeptEmployees(@PathVariable long deptId){
    return employeeService.getDeptEmps(deptId);
}


    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }


    @GetMapping("/getEmpByFirstName/{firstName}")
    public List<Employee> getEmpByFirstName(@PathVariable String firstName){
        return employeeService.getEmployeesByFirstName(firstName);
    }


    @GetMapping("/getEmpSearch/{firstName}/{lastName}")
    public List<Employee> getEmpByFirstName(@PathVariable String firstName,@PathVariable String lastName){
        return employeeService.getEmpSearch(firstName,lastName);
    }


    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);
    }

    @PostMapping("/addEmployee")
    public String addEmp(@RequestBody Employee newEmp){
         employeeService.addEmployee(newEmp);
         return "saved successfully";
    }


    @PutMapping("/updateEmployee")
    public String updateEmp(@RequestBody Employee Emp) {
        employeeService.updateEmployee(Emp);
        return "Updated successfully";
    }






}
