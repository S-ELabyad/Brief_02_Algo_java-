package Heritage_42;

import java.util.Scanner;

public class Institut extends Etablissement {

	
   private static String Filiere;
	
	public String getFiliere() {
		return Filiere;
	}
	public void setFiliere(String Filiere) {
		this.Filiere=Filiere;
	}
	
	public Institut(int nbEtudiant , String Name, String Filiere) {
		super (nbEtudiant , Name);
		this.Filiere=Filiere;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Filiere : " + Filiere;
	}
	
	public static void main(String[] args){
		
		
		

	    Scanner Mar = new Scanner(System.in);
	     
		System.out.println("..........Institut.........");
	        Mar.nextLine();
	        System.out.println("Nom d'etablissement");
		    Name=Mar.nextLine();
			System.out.println("nombre d'etudiante");
			nbEtudiant=Mar.nextInt();
		  Filiere= Mar.nextLine();
	    	System.out.println("Filiere");
	    	
	        Mar.nextLine();
	        System.out.println("BienVenu Dans l'Etablissement  : " + Name + " et nombre d'etudiant et " + nbEtudiant + " et votre filiere " + Filiere);
	        Mar.close();
	        
	        



}
}

