package exercice;

import java.util.Scanner;
public class exercice01 { 
    public static double racine(int n) {
        double tmp;
        double d = n / 2;
        do {
           tmp = d;
           d = (tmp + (n / tmp)) / 2;
        } while ((tmp - d) != 0);
        return d;
    }
    public static void main(String[] args)  
    {   
        System.out.print("Entrez un nombre :");
        Scanner sc = new Scanner(System.in);
        int nbr = sc.nextInt(); 
        sc.close();
        System.out.println("Racine carrée de "+ nbr + " est : "+ racine(nbr));
        System.out.print("Quittez:");
    } 
}
