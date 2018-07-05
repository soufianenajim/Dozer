package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="compte_db")
public class Compte extends Historized implements Serializable {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = -741254279934476637L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	@Column(name="TAUX")
	private double taux ;
	
	@Column(name="SALAIRE")
	private double salaire;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;
	
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Compte(long id, double taux, double salaire) {
		this.id=id;
		this.taux = taux;
		this.salaire = salaire;
	}
	
	
}
