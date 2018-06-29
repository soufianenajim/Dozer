package com.example.demo.model;

import java.util.List;

public class Employee {
	private Long id ;
	private String firstName;
	private String lastName;
	
	private List<Compte> comptes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public Employee(Long id, String firstName, String lastName,
			List<Compte> comptes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.comptes = comptes;
	}
	
	
	

}
