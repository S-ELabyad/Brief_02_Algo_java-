package Exercice01;

import java.util.Scanner;

public class TestPoint {

	private static int p1 ;
	private static int p2;
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	     System.out.println("Entrer la valeur de p1");
	     p1=sc.nextInt();
	     System.out.println("Entrer la valeur de p2");
	     p2=sc.nextInt();
	     
	     String chaine1 = "Point p1 = ";
		 String chaine2 ="new String " + "("+p1+","+p2+")";
		 System.out.println( chaine1 + chaine2 );
	   
	}
		
}
