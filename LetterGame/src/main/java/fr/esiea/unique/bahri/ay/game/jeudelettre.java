package fr.esiea.unique.bahri.ay.game;

import java.io.FileNotFoundException;
import java.util.HashSet;

import fr.esiea.unique.bahri.ay.decor.Decorations;
import fr.esiea.unique.bahri.ay.dictionary.Dictionnaire;
import fr.esiea.unique.bahri.ay.joueur.CutWord;
import fr.esiea.unique.bahri.ay.joueur.DefPlayer;
import fr.esiea.unique.bahri.ay.joueur.Player;
import fr.esiea.unique.bahri.ay.joueur.Saisie;
import fr.esiea.unique.bahri.ay.plateforme.Pioche;
import fr.esiea.unique.bahri.ay.plateforme.Pot;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyLettres;

public class jeudelettre {
	
public static boolean Jeton=true ;
static HashSet<String> ActifPlayer;

	public static void main(String[] args) throws FileNotFoundException {
		//HashSet<String> Joueur1  = new HashSet<String>(); // Create a player
		
		
		 do{ //! Joueur1.size() < 10
			
			new DefPlayer(Jeton);
			ActifPlayer  = DefPlayer.JoueurActif;
			
			new Pioche(2); // Check 2 letters and add them to PotCommun
			new Decorations(); //Print some details


			System.out.println("Voici les Mots du Joueur1:");
			System.out.println(Player.Joueur1);
			
			System.out.println("Voici les Mots du Joueur2:");
			System.out.println(Player.Joueur2);
			
		    System.out.println("C'est au tour de "+DefPlayer.nom);

		    
		    new Saisie();   // Player try a word
		    String Essai = Saisie.Essai;  
		    	    
		    if(Dictionnaire.isWord(Essai)){  // If tried word exists
		    	
		    	new CutWord(Essai); //Decompose the word into several chars and add them into LettreUtilisés
		    	String[] LettresUtilisés = CutWord.TableauLettres;
		    	
			    new  VerifyLettres(Essai); //Check if used letters are from Potcommun
			    
			    
			    
			   // new VerifyUnicity(Essai);
			    
			    
			    
			    if(VerifyLettres.AllLettersAre){ // If chars are in PotCommun && Unique==true
			    	
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
		      
		}while(ActifPlayer.size() < 10); //while
		
		
		if(ActifPlayer.size() == 10){
			System.out.println("BRAVO TU as gagné!"+DefPlayer.nom);//Final congratulations
		}
		
	}//main
		     
	}//class


