package Exercice05;

import java.util.Scanner;

public class Account {

	private static String Nom;
	private static String Adresse;
	private double Solde;
	

	
	
	public String getNomt() {
		return Nom;
	}
	
	public void setNom(String Nom) {
		this.Nom=Nom;
	}
	

	public String getAdresse() {
		return Adresse;
	}
	
	public void setAdresse(String Adresse) {
		this.Adresse=Adresse;
	}
	
	public double getSolde() {
		return Solde;
	}
	
	public void setSolde(double Solde) {
		this.Solde=Solde;
	}
	
	
	
	public Account(String Nom ,String Adresse, Double Solde) {
		this.Nom=Nom;
		this.Adresse=Adresse;
		this.Solde=Solde;
		
	}
	
	@Override
	public String toString() {
		return "Nom:"+ Nom + "\n Adresse:"+ Adresse + "\n Solde:"+ Solde;
	
		
	}
	
	public static void main(String[] args){
		
					
				

			    Scanner Var = new Scanner(System.in);
			     
				System.out.println("..........Account.........");
				Var.nextLine();
				System.out.println("Entrer votre nom");
			    String Nom= Var.nextLine();
				System.out.println("Entrer votre Adresse");
			 	String Adresse= Var.nextLine();
			 	System.out.println("Entrer votre Solde");
			 	Double Solde= Var.nextDouble();
				 System.out.println("BienVenu  : " + Nom + " l'adresse " +Adresse+ " et du solde "+Solde+" DH " );  // Output user input
			        Var.close();
        
			

	
	
	}
		}




