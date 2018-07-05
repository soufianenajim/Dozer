package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example") 
public class DozerMappingApplication{
	
	
	public static void main(String[] args) throws Exception {
		
		SpringApplication.run(DozerMappingApplication.class, args);
//		Optional<Employee> employe1=Optional.empty() ;
//		System.out.println("employe1"+employe1.get());
		/*ApplicationContext ctx = SpringApplication.run(DozerMappingApplication.class, args);
			EmployeeService employeeService = ctx.getBean(EmployeeService.class);
	
		
		employeeService.findByCritere().forEach(e->{
			System.out.println("employe"+e);
			
		});
	*/	
//		List<Compte> comptes=Stream.of(new Compte(1L,100.0,8000.0),new Compte(2L,100.0,10000.0))
//				.collect(Collectors.toList());
//		
//		List<Employee> employes=Stream.of(new Employee(1L, "test", "test",comptes),new Employee(2L, "test1", "test1",comptes),new Employee(3L, "test2", "test2",comptes))
//				.collect(Collectors.toList());
//		EmployeDTO employeDTO=employeService.findEmploye(2L, employes);
//		System.out.println("employee DTO"+employeDTO);
//		
//		
//		System.out.println("run");
//		
//	Employee employee=new Employee(1L, "test", "test");
//		EmployeDTO employeDTO = new DozerBeanMapper().map(employee, EmployeDTO.class,"EMPLOYEE_NAME");
//		System.out.println("employee DTO"+employeDTO);
//		
	}


	
}
