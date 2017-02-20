package fr.esiea.unique.bahri.ay.plateforme;

import java.util.ArrayList;

public class Pot {
	
	public static ArrayList<Character> PotCommun = new ArrayList<Character>();
	
	
	public static void AjoutDansPot(char lettre){
	 PotCommun.add(lettre);
	}
	
	public static void EnleverCharUtilisé(String[] UsedLettres){
    	for(int i = 0; i< UsedLettres.length;i++){
    		String elem = new String(UsedLettres[i]);
    		char UsedChar = elem.charAt(0); //conversion String char
    		Pot.RetireDuPot(UsedChar); // suppression des lettres utilisé du potcomuun
    	}//FOR	
	}
	
	public static void RetireDuPot(char lettre){
		for (int i = 0; i < PotCommun.size(); i++) {
		    char elem = PotCommun.get(i);
		    if( elem == lettre){
		    	PotCommun.remove(i);
		    }
		}
		}
	}

