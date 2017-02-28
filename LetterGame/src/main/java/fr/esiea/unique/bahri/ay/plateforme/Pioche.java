package fr.esiea.unique.bahri.ay.plateforme;

import java.util.Random;

public class Pioche {
	
	public static char GetPioche(){
	Random r = new Random();
	char c = (char) (r.nextInt(26) + 'a');	
	return c;
	}
	
	public  Pioche(int Type){
		if(Type == 2){
		
		System.out.println("< Deux Lettres piochées>");

		 char lettrepioché1 = GetPioche();
		 Pot.AjoutDansPot(lettrepioché1);
	     char lettrepioché2 = GetPioche();
	     Pot.AjoutDansPot(lettrepioché2);}
		else{
		System.out.println("< Une Lettre piochée>");
		 char lettrepioché1 = GetPioche();
	     Pot.AjoutDansPot(lettrepioché1);
		}
	}
	
}
