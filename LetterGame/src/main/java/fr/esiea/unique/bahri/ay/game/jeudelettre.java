package fr.esiea.unique.bahri.ay.game;

import java.io.FileNotFoundException;
import java.util.HashSet;

import fr.esiea.unique.bahri.ay.decor.Decorations;
import fr.esiea.unique.bahri.ay.dictionary.Dictionnaire;
import fr.esiea.unique.bahri.ay.joueur.DefPlayer;
import fr.esiea.unique.bahri.ay.joueur.Player;
import fr.esiea.unique.bahri.ay.saisiedujoueur.CutWord;
import fr.esiea.unique.bahri.ay.saisiedujoueur.Saisie;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyLettres;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyUnicity;
import gestionPot.Pioche;
import gestionPot.Pot;

public class jeudelettre {
	
public static boolean Jeton=true ;

static HashSet<String> ActifPlayer;


public static void main(String[] args) throws FileNotFoundException {

	do{ //! Joueur1.size() < 10
			new Decorations(); //Print some details
			
			new DefPlayer(Jeton); // En fonction du jeton on determine à qui est le tour
			ActifPlayer  = DefPlayer.JoueurActif;

			System.out.println("C'est au tour de "+DefPlayer.nom);

			new Pioche(2); // Check 2 letters and add them to PotCommun
			
		    System.out.println("Voici le pot commun:");		    
		    System.out.println (Pot.PotCommun);	


			
		   // System.out.println("C'est au tour de "+DefPlayer.nom);

		    
		    new Saisie();   // Player try a word
		    String Essai = Saisie.Essai;  
		    	    
		    if(Dictionnaire.isWord(Essai)){  // If tried word exists
		    	
		    	new CutWord(Essai); //Decompose the word into several chars and add them into LettreUtilisés
		    	String[] LettresUtilisés = CutWord.TableauLettres;
		    	
			    new  VerifyLettres(Essai); //Check if used letters are from Potcommun
			    
			    
			    
			    new VerifyUnicity(Essai, ActifPlayer);
			    
			    
			  
			    if(VerifyLettres.AllLettersAre && VerifyUnicity.unique){ // If chars are in PotCommun && Unique==true
			    	
			    	Pot.EnleverCharUtilisé(LettresUtilisés); //Remove used chars from PotCommun
			    			    	 			    	
		    	   ActifPlayer.add(Essai);  // Player Win 1 word
				 
		    	    new Pioche(1); // Player check 1 letter
				 
		    	    System.out.println ("Bien joué! Voici tes mots trouvés"+ ActifPlayer);	// To congratulate	
	
			    }//IF VerifyLetters
			    else{
				    Jeton = !Jeton;
			    }
			    
		    }// IF all it's ok	   
		    
		    else{
		    Jeton = !Jeton;
		    System.out.println("Actuellement tu as trouvé\t"+ActifPlayer.size() +"\tmots"); // Current situation
		    }
			System.out.println("Voici les Mots du Joueur1:"+Player.Joueur1);
			//System.out.println(Player.Joueur1);
			
			System.out.println("Voici les Mots du Joueur2:"+Player.Joueur2);
			//System.out.println(Player.Joueur2);		      
		}while(ActifPlayer.size() < 10); //while
		
		
		if(ActifPlayer.size() == 10){
			System.out.println("BRAVO TU as gagné!"+DefPlayer.nom);//Final congratulations
		}
		
	}//main
		     
	}//class


