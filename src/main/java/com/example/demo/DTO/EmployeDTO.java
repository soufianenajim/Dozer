package com.example.demo.DTO;

import java.util.List;

public class EmployeDTO {
	private Long id ;
	private String firstName;
	private String lastName;
	private List<CompteDTO> comptes;
	
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
	
	public List<CompteDTO> getComptes() {
		return comptes;
	}
	public void setComptes(List<CompteDTO> comptes) {
		this.comptes = comptes;
	}
	@Override
	public String toString() {
		return "EmployeDTO [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", comptes=" + comptes + "]";
	}
	public EmployeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
