package Exercice01;

import java.util.Scanner;

public class Point {
	
	static int x;
	static int y;
	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
     System.out.println("Entrer la valeur de x");
     x=sc.nextInt();
     System.out.println("Entrer la valeur de Y");
     y=sc.nextInt();
   
     
     if(x>y) {
    	 System.out.println("la distance entre deux point est: " +(x-y));
     }
     else {
    	 System.out.println("eror");
     }
     sc.close();
    
   
}
}