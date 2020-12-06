package Exercice02;

import java.util.Scanner;

public class Chien {



  
	static String Name;
	private static String Aboyer1;
	private static String Aboyer2;
	private static String Aboyer3;
	private static String Aboyer4;
	private static String Aboyer5;

	
	public Chien(){
		
	}
	

	

	@SuppressWarnings("static-access")
	public  Chien(String  Ghhhhhhhhhh  , String WWWWOARF  , String WWWwWOARF ,String Iwiw ,String awaw ) {
		
		
		this.Aboyer1= Ghhhhhhhhhh ;
		this.Aboyer2= WWWWOARF ;
		this.Aboyer3=  WWWwWOARF ;
		this.Aboyer4= Iwiw ;
		this.Aboyer5=  awaw ;
		
	}

   
	
	        
	   
	    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Enter votre nom");
		Name=sc.nextLine();
		Aboyer1= sc.nextLine();
		Aboyer2=sc.nextLine();
		Aboyer3=sc.nextLine();
		Aboyer4=sc.nextLine();
		Aboyer5=sc.nextLine();
		
		
		
		
	
		if(Name == "Rex" ) {
			System.out.println("Je suis en colère. " +Aboyer1+ " !!! " +Aboyer2+ " !! " +Aboyer3+ " !! -je mange de la viande ");
			
		}
		
		else{
			System.out.println("je ne suis pas du tout en colère. " +Aboyer4+ " !! " +Aboyer5+ " !! -je mange du poisson" );
		}
		
		sc.close();
	}
}
