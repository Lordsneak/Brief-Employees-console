package com.employe.app;

public class EmployeHoraire extends Person{

	public String nom;
	public double salaire;
		 int taux=10;
		public int heure;
		
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
		public int getTaux() {
			return taux;
		}
		public void setTaux(int taux) {
			this.taux = taux;
		}
		public int getHeure() {
			return heure;
		}
		public void setHeure(int heure) {
			this.heure = heure;
		}
		public EmployeHoraire(String nom,double salaire,int heure) {
			//super(nom, salaire);
			this.heure=heure;
			this.nom=nom;
			this.salaire=salaire;
			 	
		}
		public double SalaireMensuel() {
			return taux*this.heure;
		}
}

