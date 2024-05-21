package com.RestFulApi.Employees.services;

import com.RestFulApi.Employees.model.Department;
import com.RestFulApi.Employees.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public List<Department> getAllDepartments(){
        return  departmentRepository.findAll();
    }


    public  List<Department> getDepartmentByFirstName(String firstName){
        return departmentRepository.findByDepartmentName(firstName);
    }


    public List<Department> getDeptSearch(String firstName){
        return  departmentRepository.depSearch(firstName);
    }

    public Department getDepartment(long id) {
        return departmentRepository.findById(id).get();
    }



    public void deleteDepartment(long id){
        departmentRepository.deleteById(id);
    }

    public void addDepartment(Department newDep){
        departmentRepository.save(newDep);
    }


    public void updateDepartment (Department Dep){
        departmentRepository.save(Dep);
    }

}
