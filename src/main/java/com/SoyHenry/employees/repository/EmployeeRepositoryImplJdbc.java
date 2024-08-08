package com.SoyHenry.employees.repository;

import com.SoyHenry.employees.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImplJdbc implements EmployeeRepository {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepositoryImplJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Employee.class));
    }

    @Override
    public int save(Employee employee) {
        String sql = "INSERT INTO employees (name, jobPosition, admissionDate)VALUES(?,?,?)";
        return jdbcTemplate.update(sql, employee.getName(), employee.getJobPosition(), employee.getAdmissionDate());
    }

    @Override
    public int delete(Long id) {
        String sql = "DELETE FROM employees WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
}
