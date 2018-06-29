package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.EmployeDTO;
import com.example.demo.model.Employee;



public interface EmployeeService {
	public void addEmploye(EmployeDTO employee,List<Employee> employes);
	public EmployeDTO findEmploye(Long id,List<Employee> employes) throws Exception;
}
