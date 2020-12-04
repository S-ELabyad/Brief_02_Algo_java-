package Heritage_42;

import java.util.Scanner;

public class Etablissement {

	protected static int nbEtudiant;
	protected static String Name;
	
	
	public int getnbEtudiant() {
		return nbEtudiant;
	}
	
	public void setnbEtudiant(int nbEtudiant) {
		this.nbEtudiant=nbEtudiant;
	}
	

	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	
	
	public Etablissement(int nbEtudiant ,String Name) {
		this.nbEtudiant=nbEtudiant;
		this.Name=Name;
		
	}
	
	@Override
	public String toString() {
		return "nbEtudiant:"+ nbEtudiant + "\n Name:"+ Name ;
	
		
	}
	
	public static void main(String[] args){
		
					
				

			    Scanner Var = new Scanner(System.in);
			     
				System.out.println("..........Etablissement.........");
				Var.nextLine();
				System.out.println("Nom d'etablissement");
			    String Name= Var.nextLine();
				System.out.println("nombre d'etudiante");
			 	int nbEtudiant= Var.nextInt();
				 System.out.println("BienVenu Dans l'Etablissement  : " + Name + "et nombre d'etudiant et " +nbEtudiant );  // Output user input
			        Var.close();
        
			

	
	
	}
		}



