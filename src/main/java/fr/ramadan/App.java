package fr.ramadan;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Bonjour");

        //Récupérer le nombre d'heure travaillées
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nombres d'heures travaillées");
        int heuresTravaillees = clavier.nextInt();
        
        // jhg

        //Récupérer le taux horaire
        System.out.print("Entrez le taux horaires");
        double tauxHoraire = clavier.nextDouble();
         clavier.close();
        
        //Multiplier le nombre d'heures par le taux horaire
        double salaireBrut = heuresTravaillees * tauxHoraire;
 
        //Afficher le résultat
        System.out.println("le salaire brut est de : "+ salaireBrut);



    }
    
}
