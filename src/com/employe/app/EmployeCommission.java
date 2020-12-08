package com.employe.app;

public class EmployeCommission extends Person{
	public String nom;
	public double salaire;
		int vente;
		
		public EmployeCommission(String nom,double salaire,int vente) {
			//super(nom,salaire);
			this.vente=vente;
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
		public int getVente() {
			return vente;
		}
		public void setVente(int vente) {
			this.vente = vente;
		}
		public double SalaireMensuel() {
			//return super.SalaireMensuel() + vente*50;
			return this.salaire + vente*50;
		}
}

