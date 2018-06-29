package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.DTO.EmployeDTO;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;


@SpringBootApplication
@ComponentScan("com.example") 
public class DozerMappingApplication {
	
	
	
	public static void main(String[] args) throws Exception {
		
		ApplicationContext ctx = SpringApplication.run(DozerMappingApplication.class, args);
		EmployeeService employeService = ctx.getBean(EmployeeService.class);
		List<Employee> employes=Stream.of(new Employee(1L, "test", "test"),new Employee(2L, "test1", "test1"),new Employee(3L, "test2", "test2"))
				.collect(Collectors.toList());
		EmployeDTO employeDTO=employeService.findEmploye(2L, employes);
		System.out.println("employee DTO"+employeDTO);
		
		
		System.out.println("run");
		
//	Employee employee=new Employee(1L, "test", "test");
//		EmployeDTO employeDTO = new DozerBeanMapper().map(employee, EmployeDTO.class,"EMPLOYEE_NAME");
//		System.out.println("employee DTO"+employeDTO);
//		
	}
}
