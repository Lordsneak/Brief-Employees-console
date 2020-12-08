package com.employe.app;

public class EmployeFixe extends Person{
	public String nom;
	public double salaire;
		public EmployeFixe(String nom,double salaire) {
			//super(nom,salaire);
			this.nom=nom;
			this.salaire=salaire;
			 	
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public double getSalaire() {
			return salaire;
		}
		public void setSalaire(double salaire) {
			this.salaire = salaire;
		}
		public double SalaireMensuel() {
			//return super.SalaireMensuel();
			return this.salaire;
		}
}
