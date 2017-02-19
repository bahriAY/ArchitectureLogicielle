package fr.esiea.unique.bahri.ay.plateforme;

import java.util.Random;

public class Pioche {
	
	public static char GetPioche(){
	Random r = new Random();
	char c = (char) (r.nextInt(26) + 'a');	
	return c;
	//System.out.println(c);	
	}
	
	public  Pioche(){
		 char lettrepioché1 = GetPioche();
		 Pot.AjoutDansPot(lettrepioché1);
	     char lettrepioché2 = GetPioche();
	     Pot.AjoutDansPot(lettrepioché2);		
	}
	
}
