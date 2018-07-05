package com.example.demo.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.model.Employee;
import com.example.demo.model.Employee_;

public class EmployeSpecification {
	
	public static Specification<Employee> idEqual(Long id){
		
		return (Root<Employee> root,CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get(Employee_.id), id);
		
	}
	public static Specification<Employee> eqaulFirstName(String firstName){
		
		return (Root<Employee> root,CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get(Employee_.firstName), firstName);
	}
public static Specification<Employee> eqaulLastName(String lastName){
		
		return (Root<Employee> root,CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.like(root.get(Employee_.lastName ), lastName);
	}
}
