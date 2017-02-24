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
		
		HashSet<String> Joueur1  = new HashSet<String>(); // Create a player
		 
	while ( Joueur1.size() < 10){ 
		
		    new Pioche(2); // Check 2 letters and add them to PotCommun
		    
			new Decorations(); //Print some details
		    
		    new Saisie();   // Player try a word
		    String Essai = Saisie.Essai;  
		    	    
		    if(Dictionnaire.isWord(Essai)){  // If tried word exists
		    	
		    	new CutWord(Essai); //Decompose the word into several chars and add them into LettreUtilisés
		    	String[] LettresUtilisés = CutWord.TableauLettres;
		    	
			    new  VerifyLettres(Essai); //Check if used letters are from Potcommun
			    
			   // new VerifyUnicity(Essai);
			    
			    if(VerifyLettres.AllLettersAre){ // If chars are in PotCommun && Unique==true
			    	
			    	Pot.EnleverCharUtilisé(LettresUtilisés); //Remove used chars from PotCommun
			    			    	 			    	
		    	    Joueur1.add(Essai);  // Player Win 1 word
				 
		    	    new Pioche(1); // Player check 1 letter
				 
		    	    System.out.println ("Bien joué! Voici tes mots trouvés"+ Joueur1);	// To congratulate	
	
			    }//IF VerifyLetters
			    
			    
		    }// IF all it's ok	   
		    
		    else{
		    System.out.println("Actuellement tu as trouvé\t"+Joueur1.size() +"\tmots"); // Current situation
		    }
		      
		} //while
		
		
		if(Joueur1.size() == 10){
			System.out.println("BRAVO TU as gagné!");//Final congratulations
		}
		
	}//main
		     
	}//class


