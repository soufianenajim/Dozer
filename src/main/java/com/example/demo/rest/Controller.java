package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CompteDTO;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.model.Compte;
import com.example.demo.service.EmployeeService;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/save")
	public String addEmploye(){
		employeeService.addEmploye();
		return "saved success";
	}
	@RequestMapping("/findlf")
	public List<EmployeeDTO> findEmploye(){
	
	return	employeeService.findByCritere1("najim", "soufiane");
		
	}
	@RequestMapping("/findID")
	public EmployeeDTO findEmployebyId() throws Exception{
	
	return	employeeService.findEmploye(1L);
		
	}
	@RequestMapping("/findall")
	public List<EmployeeDTO> findEmployes(){
	
	return	employeeService.findByCritere();
		
	}
	@RequestMapping("/findCompte")
	public List<CompteDTO> findCompte(){
	
	return	employeeService.findCompte(1L);
		
	
	}
}
