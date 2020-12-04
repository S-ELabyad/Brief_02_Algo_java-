package exercice;

import java.util.Scanner;

public class exeriec02 {
	 public static void main(String[] args) {
		 double solde, soldePrecedent,interet=0.01;
		 int nombreMois;
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("taper le solde");
		 solde = sc.nextDouble();
		 soldePrecedent= solde;
		 
		 System.out.println("taper le nombre des Mois");
		 nombreMois = sc.nextInt();
		 sc.close();
		 
		 for(int i=0; i < nombreMois; i++) {
			 solde= solde + (solde * interet);
			 
		 }
		 
		 System.out.println("Les interets cumulés après " +nombreMois+ "mois est : " + (solde-soldePrecedent)) ;
		 System.out.println("le solde total est :" +solde);
		 	
	 }
}
