package com.example.demo.service;

import java.util.List;

import com.example.demo.DTO.CompteDTO;
import com.example.demo.DTO.EmployeeDTO;



public interface EmployeeService {
	public void addEmploye();
	public EmployeeDTO findEmploye(Long id) throws Exception;
	public List<EmployeeDTO> findByCritere();	
	public List<EmployeeDTO> findByCritere1(String lastName,String firstName);
	public List<CompteDTO> findCompte(Long idEmployee);
}
