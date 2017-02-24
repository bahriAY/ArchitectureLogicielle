package fr.esiea.unique.bahri.ay.verificationMot;

import fr.esiea.unique.bahri.ay.plateforme.Pot;

public class VerifyLettres {
	public static boolean AllLettersAre = false;

	public VerifyLettres(String àverif){
		AreLetters(àverif);
	}
		
		
	
	public static boolean AreLetters(String essai) {
				
	String[] LettresUtilisés = essai.split(""); //on decoupe le string
  
   	for(int i = 0; i< LettresUtilisés.length;i++){
   		 
   	String elem = new String(LettresUtilisés[i]);
	    char UsedChar = elem.charAt(0); //conversion String char	    	    		
	    	if(Pot.PotCommun.contains(UsedChar)){
	    		System.out.println("Il y a bien cette lettre dans le POT:");
	    		System.out.println(UsedChar);
	    		AllLettersAre = true;
	    	}
	    	else{
	    		System.out.println("Il n'y a pas cette lettre dans le POT!!: ");
	    		System.out.println(UsedChar);
	    		AllLettersAre = false;
	    		//break;
	    	}
	   
   	 }//FOR
   	
   	//System.out.println(AreLetters);
	return AllLettersAre;
	}//AreLetters
}//classc 
