package com.SoyHenry.employees.mapper;

import com.SoyHenry.employees.dto.EmployeeDto;
import com.SoyHenry.employees.entities.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee mapToEmployee(EmployeeDto employeeDto);
    EmployeeDto mapToEmployeeDto(Employee employee);
}
