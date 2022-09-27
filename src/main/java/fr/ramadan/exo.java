package fr.ramadan;

import java.util.Scanner;

public class exo {
    
    public static void main(String[] args) {
        System.out.println("Bonjour");

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nom");
        int nom1 = clavier.nextInt();

        System.out.print("Entrez un deuxieme nom");
        int nom2 = clavier.nextInt();
        
        System.out.print("Entrez un nombre");
        double nombre = clavier.nextDouble();

        System.out.print("Entrez un adjectif");
        int adj= clavier.nextInt();
        clavier.close();
        
        System.out.print("il était une fois" + nom1 + nombre + nom2 + adj);



    }
    
}
