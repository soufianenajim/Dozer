package com.example.demo.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.example.demo.model.Compte;
import com.example.demo.model.Compte_;
import com.example.demo.model.Employee_;

public class CompteSpecification {
	
	public static Specification<Compte> idEqual(Long id){
		
		return (Root<Compte> root,CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get(Compte_.id), id);
		
	}
	
	public static Specification<Compte> employeEqual(Long id){
		return (Root<Compte> root,CriteriaQuery<?> query, CriteriaBuilder cb) -> cb.equal(root.get(Compte_.employee).get(Employee_.id), id);
		
	}
	
}
