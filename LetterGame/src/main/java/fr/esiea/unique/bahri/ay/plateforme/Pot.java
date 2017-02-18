package fr.esiea.unique.bahri.ay.plateforme;

import java.util.ArrayList;

public class Pot {
	
	public static ArrayList<Character> PotCommun = new ArrayList<Character>();
	
	
	public static void AjoutDansPot(char lettre){
	 PotCommun.add(lettre);
	}
	
	public static void RetireDuPot(char lettre){
	 PotCommun.remove(lettre);
	}
}
