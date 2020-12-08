package com.employe.app;

public class Main {

	public static void main(String[] args) {
		EmployeFixe ef1 = new EmployeFixe("Hamza Ghounbaz" ,10000);
		EmployeCommission ec1 = new EmployeCommission("Hamza" ,10000,22);
		EmployeHoraire eh1 = new EmployeHoraire("Hamza",20,10);
		
		System.out.println("Name :  "+ ef1.getNom() + "   " +"Salaire Mensuel : " + ef1.SalaireMensuel() + " MAD");
		System.out.println("Name :  "+ ec1.getNom() + "   " +"Salaire Mensuel Avec Commission : " + ec1.SalaireMensuel() + "  MAD");
		System.out.println("Name :  "+ eh1.getNom() + "   " +"Salaire Mensuel Avec Horaire : " + eh1.SalaireMensuel() + " MAD");

	}

}
