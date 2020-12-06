package Exercice04;

import java.util.Scanner;

public class Account {
	
	public static String Nom;
	public static String Adresse;
	public static int Solde;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
		 System.out.println("Entrer votre Nom");
		 Nom=sc.nextLine();
		 System.out.println("Entrer votre Adresse");
		 Adresse=sc.nextLine();
		 System.out.println("Entrer votre Solde");
		 Solde=sc.nextInt();
		
		 System.out.println(" Bienvenu " +Nom+ " de l'adresse " +Adresse+ " et du solde " +Solde+ " DH " );
		 sc.nextLine();
		 double calculerInterer,number,Solde;

		    System.out.println("Entrer le solde encors fois: ");
		    Solde = sc.nextDouble();
			System.out.println("Entrer le pourcentage d'inetert:");
			number=sc.nextDouble();
		
			
			double calculerIntere = (Solde * number/100);
			
			System.out.println("Le prix d'interet est : " + calculerIntere+" DH ");
		
			 sc.close();
		 
	}

}
