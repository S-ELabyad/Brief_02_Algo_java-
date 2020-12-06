package Exercice03;

import java.util.Scanner;

public class Client {
	public String Name;
	public String Name2;
	public String Adresse;
	public String Adresse2;
    public String Solde;
    public String Solde2;
    public Client(String nom,String adres1,String solde1, String nom2,String adres2,String solde2 ) {
    	this.Name=nom;
    	this.Adresse=adres1;
    	this.Solde=solde1;
    	this.Name2=nom2;
    	this.Adresse2=adres2;
    	this.Solde2=solde2;
    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc= new Scanner(System.in);
	   
		Client client=new Client("El Alami Hassan","(Safi)","14765.8" ,"Karimi Khalid","(Casablanca)"," 7654.0");
		
		System.out.println(client.Name+ " habite à " +client.Adresse+ " -info solde " +client.Solde+ "DH");
	  sc.nextLine();
		System.out.println(client.Name2+ " habite à " +client.Adresse2+ " -info solde " +client.Solde2+ "DH");
	  
		sc.close();
	}

}
