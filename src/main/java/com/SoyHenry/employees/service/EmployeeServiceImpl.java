package com.SoyHenry.employees.service;

import com.SoyHenry.employees.dto.EmployeeDto;
import com.SoyHenry.employees.entities.Employee;
import com.SoyHenry.employees.mapper.EmployeeMapper;
import com.SoyHenry.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {



    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<EmployeeDto> getAll() {
        List<Employee> employees = employeeRepository.getAllEmployees();
        return mapToDtoList(employees);

    }

    @Override
    public void createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeMapper.mapToEmployee(employeeDto);
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.delete(id);
    }

    private List<EmployeeDto> mapToDtoList(List<Employee> employees){
        return employees.stream()
                .map(employeeMapper::mapToEmployeeDto)
                .collect(Collectors.toList());
    }
}
