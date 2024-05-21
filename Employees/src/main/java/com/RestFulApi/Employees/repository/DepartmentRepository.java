package com.RestFulApi.Employees.repository;

import com.RestFulApi.Employees.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public List<Department> findByDepartmentName (String firstName);



    //custom query
    @Query("SELECT dep FROM Department dep WHERE dep.departmentName=:NameBind")
    public List<Department> depSearch(@Param("NameBind") String departmentName);

}
