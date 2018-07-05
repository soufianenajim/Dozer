package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CompteDTO;
import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.Repository.CompteRepository;
import com.example.demo.Repository.CompteSpecification;
import com.example.demo.Repository.EmployeSpecification;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Compte;
import com.example.demo.model.Employee;

@Service("employeeService")
@Configurable
public class EmployeServiceImpl implements EmployeeService {

	@Autowired
	private Mapper mapper;

	@Autowired
	private EmployeeRepository employeeRepository;
   @Autowired
   private CompteRepository compteRepository;
	@Override
	@Transactional
	public void addEmploye() {
		for (int i = 0; i < 5; i++) {
			employeeRepository.save(new Employee("soufiane", "najim"));
		}
		for (int i = 0; i < 5; i++) {
			employeeRepository.save(new Employee("abdel", "jalit"));
		}
		for (int i = 0; i < 5; i++) {
			employeeRepository.save(new Employee("hamza", "zoutine"));
		}
	}

	@Override
	public EmployeeDTO findEmploye(Long id) throws Exception {

		;

		// org.dozer.Mapper mapper = (Mapper) dozerBean.getObject();
		// Employee employee= employes.stream().filter(employe ->
		// employe.getId() == id).findAny().get();
		Optional<Employee> employee = employeeRepository.findById(id);

		EmployeeDTO employeDTO = mapper.map(employee.get(), EmployeeDTO.class, "EMPLOYEE");
		return employeDTO;
	}

	@Override
	public List<EmployeeDTO> findByCritere() {

		List<Employee> employees = employeeRepository.findAll(PageRequest.of(0, 20)).getContent();
		List<Employee> employees1 = employeeRepository.findAll();
				// for (int i = 0; i < employees.size(); i++) {
		// employeesDTO.add(mapper.map(employees.get(i),EmployeeDTO.class,"EMPLOYEE"));
		// }
		return employees1.stream().map(e -> mapper.map(e, EmployeeDTO.class, "EMPLOYEE")).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDTO> findByCritere1(String lastName, String firstName) {

		List<Employee> employees = employeeRepository.findAll(
				EmployeSpecification.eqaulFirstName(firstName).and(EmployeSpecification.eqaulLastName(lastName).and(EmployeSpecification.idEqual(1L))));
		return employees.stream().map(e -> mapper.map(e, EmployeeDTO.class, "EMPLOYEE")).collect(Collectors.toList());
	}

	@Override
	public List<CompteDTO> findCompte(Long idEmployee) {
		List<Compte> comptes= compteRepository.findAll(CompteSpecification.employeEqual(idEmployee));
		
		return comptes.stream().map(c -> mapper.map(c, CompteDTO.class, "COMPTE_EMPLOYEE")).collect(Collectors.toList());
				}

}
