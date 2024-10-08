package com.project.ems_backend.service;

import com.project.ems_backend.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService
{
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getEmployees();

    EmployeeDto upadteEmployee(Long employeeId,EmployeeDto employeeDto);

    void deleteEmployee(Long Id);
}
