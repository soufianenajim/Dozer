package com.example.demo.model;

public class Compte {

	private double taux ;
	private double salaire;
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
	public Compte(double taux, double salaire) {
		super();
		this.taux = taux;
		this.salaire = salaire;
	}
	
	
}