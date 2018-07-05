package com.example.demo.DTO;

public class CompteDTO {

	private double taux ;
	private double salaire;
	private EmployeeDTO employee;
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
	
	public EmployeeDTO getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDTO employee) {
		this.employee = employee;
	}
	public CompteDTO(double taux, double salaire) {
		super();
		this.taux = taux;
		this.salaire = salaire;
	}
	@Override
	public String toString() {
		return "CompteDTO [taux=" + taux + ", salaire=" + salaire + "]";
	}
	public CompteDTO() {
		super();
	}
	

}
