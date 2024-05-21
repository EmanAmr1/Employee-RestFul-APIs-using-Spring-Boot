package com.RestFulApi.Employees.repository;

import com.RestFulApi.Employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //custom method
    public List<Employee> findByFirstName (String firstName);

}
