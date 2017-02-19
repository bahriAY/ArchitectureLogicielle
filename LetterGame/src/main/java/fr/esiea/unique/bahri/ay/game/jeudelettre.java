package fr.esiea.unique.bahri.ay.game;

import java.io.FileNotFoundException;
import java.util.HashSet;

import fr.esiea.unique.bahri.ay.decor.Decorations;
import fr.esiea.unique.bahri.ay.dictionary.Dictionnaire;
import fr.esiea.unique.bahri.ay.joueur.CutWord;
import fr.esiea.unique.bahri.ay.joueur.Saisie;
import fr.esiea.unique.bahri.ay.plateforme.Pioche;
import fr.esiea.unique.bahri.ay.plateforme.Pot;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyLettres;

public class jeudelettre {

	public static void main(String[] args) throws FileNotFoundException {
		
		HashSet<String> Joueur1  = new HashSet<String>(); 
		 
	while ( Joueur1.size() < 10){ 
			
		    new Pioche();
		    
		    new Decorations();

		    new Saisie();
		    String Essai = Saisie.Essai;
		    
		    new Dictionnaire(Essai);
		    int SiMotDansDicos = Dictionnaire.result;	    
		    
		    
		    if(SiMotDansDicos == 1){// Le mot entré est dans le dictionnaire		    	
		    	//new CutWord(Essai);
		    	String[] LettresUtilisés = null; //tableau de chaînes qui comportera chaque lettres utilisé    	
			    String str = Essai; // le mot essayé Essai devient str	
			    LettresUtilisés = str.split(""); //on decoupe le string
  	
			    // IF Lettre sont lettres du pots
			    new  VerifyLettres(str);
			    if(VerifyLettres.AreLetters == 1){
			    	//System.out.println(VerifyLettres.AreLetters);
		    	 for(int i = 0; i< LettresUtilisés.length;i++){
		    	String elem = new String(LettresUtilisés[i]);
			    char UsedChar = elem.charAt(0); //conversion String char
			     Pot.RetireDuPot(UsedChar); // suppression des lettres utilisé du potcomuun
			     }//FOR
		    	 
		    	 Joueur1.add(Essai); // Ajoute le mot trouvé dans Joueur1 	
				 char lettrepioché1 = Pioche.GetPioche(); // Le joueur a bon donc il pioche 1X
				 Pot.AjoutDansPot(lettrepioché1);				 
			     System.out.println ("Bien joué! Voici tes mots trouvés"+ Joueur1);			
	
			    }//IF non tricheur
		    }// IF all it's ok	   
		    else{
		    System.out.println("Actuellement tu as trouvé\t"+Joueur1.size() +"\tmots");

		   /* System.out.println("- - - - - - - - - - - - - - ");
		    System.out.println("♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦♦ \n");*/
		    }
		      
		} //while
		
		
		if(Joueur1.size() == 10){
			System.out.println("BRAVO TU as gagné!");
		}
		
	}//main
		     
	}//class


