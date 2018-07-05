package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="employe_tb")
public class Employee extends Historized implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7488031358168391762L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id; 
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="employee",cascade=CascadeType.ALL)
	private List<Compte> comptes;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}
	public Employee( String firstName,
			String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}

	
	
	

}
