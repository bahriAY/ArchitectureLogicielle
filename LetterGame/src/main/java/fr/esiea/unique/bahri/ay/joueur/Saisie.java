package fr.esiea.unique.bahri.ay.joueur;

import java.util.Scanner;

public class Saisie {
	 public static String  Essai;
	public Saisie(){
	@SuppressWarnings("resource")
	Scanner essaie = new Scanner(System.in);
    System.out.println("Essayes de faire un mot:");
     Essai = essaie.nextLine();
    System.out.println("Tu as tenté le mot:\t"+Essai);
    
	}
}
