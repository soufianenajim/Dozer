package com.example.demo.service;

import java.util.List;

import org.dozer.Mapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EmployeDTO;
import com.example.demo.model.Employee;

@Service("employeeService")
@Configurable
public class EmployeServiceImpl implements EmployeeService {

	 @Autowired
	   private Mapper mapper;
	
	@Override
	public void addEmploye(EmployeDTO employee,List<Employee> employes) {
		

	}

	@Override
	public EmployeDTO findEmploye(Long id,List<Employee> employes) throws Exception {
		
		System.out.println("findEmploye");
//		org.dozer.Mapper mapper = (Mapper) dozerBean.getObject();
		Employee employee= employes.stream().filter(employe -> employe.getId() == id).findAny().get();
		
		EmployeDTO employeDTO=mapper.map(employee, EmployeDTO.class,"EMPLOYEE_NAME");
		return  employeDTO;
	}

}
