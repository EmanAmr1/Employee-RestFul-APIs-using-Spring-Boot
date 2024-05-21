package com.RestFulApi.Employees.controller;

import com.RestFulApi.Employees.model.Department;
import com.RestFulApi.Employees.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/getAllDepartments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }


    @GetMapping("/getDepByFirstName/{firstName}")
    public List<Department> getDepByFirstName(@PathVariable String firstName){
        return departmentService.getDepartmentByFirstName(firstName);
    }


    @GetMapping("/getDepSearch/{firstName}")
    public List<Department> getEmpByFirstName(@PathVariable String firstName){
        return departmentService.getDeptSearch(firstName);
    }


    @GetMapping("/getDepartment/{id}")
    public Department getEmployee(@PathVariable Long id){
        return departmentService.getDepartment(id);
    }

    @GetMapping("/deleteDepartment/{id}")
    public void deleteEmployee(@PathVariable Long id){
        departmentService.deleteDepartment(id);
    }

    @PostMapping("/addDepartment")
    public String addEmp(@RequestBody Department newDep){
        departmentService.addDepartment(newDep);
        return "saved successfully";
    }


    @PutMapping("/updateDepartment")
    public String updateDep(@RequestBody Department Dep){
        departmentService.updateDepartment(Dep);
        return "Updated successfully";
    }

}
