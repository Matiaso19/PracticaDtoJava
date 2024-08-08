package com.SoyHenry.employees.service;

import com.SoyHenry.employees.dto.EmployeeDto;
import com.SoyHenry.employees.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    List<EmployeeDto> getAll();
    void createEmployee(EmployeeDto employeeDto);
    void deleteEmployee(Long id);

}
