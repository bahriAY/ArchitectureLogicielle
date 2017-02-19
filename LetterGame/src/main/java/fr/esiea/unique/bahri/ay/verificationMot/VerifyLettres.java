package fr.esiea.unique.bahri.ay.verificationMot;

import fr.esiea.unique.bahri.ay.plateforme.Pot;

public class VerifyLettres {
public static int AreLetters=270;	

	public VerifyLettres(String essai){
		
	    String[] LettresUtilisés = essai.split(""); //on decoupe le string
  
   	 for(int i = 0; i< LettresUtilisés.length;i++){
   	String elem = new String(LettresUtilisés[i]);
	    char UsedChar = elem.charAt(0); //conversion String char	    	    		
	    	if(Pot.PotCommun.contains(UsedChar)){
	    		System.out.println("Il y a bien cette lettres dans le POT:");
	    		System.out.println(UsedChar);
	    		AreLetters= 1;		
	    	}
	    	else{
	    		System.out.println("Il n'y a pas cette lettre dans le POT!!: ");
	    		System.out.println(UsedChar);
	    		AreLetters = 0;
	    		break;
	    	}
	   
   	 }//FOR
   	 //System.out.println(AreLetters);
	}//Constructeur
}//classc 
