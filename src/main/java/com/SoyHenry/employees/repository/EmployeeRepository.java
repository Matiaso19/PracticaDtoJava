package com.SoyHenry.employees.repository;

import com.SoyHenry.employees.dto.EmployeeDto;
import com.SoyHenry.employees.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository {

    List<Employee> getAllEmployees();
    int save(Employee employee);
    int delete(Long id);

}
