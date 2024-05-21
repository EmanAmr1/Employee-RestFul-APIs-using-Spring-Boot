package com.RestFulApi.Employees.repository;

import com.RestFulApi.Employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //custom methods
    public List<Employee> findByFirstName (String firstName);

    public  List<Employee> findByDepartmentId (long department); //method take dept and return its employees


    //custom query
    @Query("SELECT emp FROM Employee emp WHERE emp.firstName=:firstNameBind AND emp.lastName =:lastNameBind")
    public List<Employee> empSearch(@Param("firstNameBind") String firstName, @Param("lastNameBind") String lastName);




}
