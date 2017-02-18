package fr.esiea.unique.bahri.ay.game;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

import fr.esiea.unique.bahri.ay.dictionary.Dictionnaire;
import fr.esiea.unique.bahri.ay.plateforme.Pioche;
import fr.esiea.unique.bahri.ay.plateforme.Pot;
import fr.esiea.unique.bahri.ay.verificationMot.Verify;

public class jeudelettre {

	public static void main(String[] args) throws FileNotFoundException {
		
		HashSet<String> Joueur1  = new HashSet<String>();
		int NbMotJ1 = Joueur1.size(); 
		boolean Piochedouble = true ;
		    
		while ( NbMotJ1 < 10){
			
		    if(Piochedouble){
			 char lettrepioché1 = Pioche.GetPioche();
			 Pot.AjoutDansPot(lettrepioché1);
		     char lettrepioché2 = Pioche.GetPioche();
		     Pot.AjoutDansPot(lettrepioché2);
		    }		    
		    if(Piochedouble == false){
		     char lettrepioché1 = Pioche.GetPioche();
		     Pot.AjoutDansPot(lettrepioché1);
		    }		    
	   
		    System.out.println("Voici le pot commun:");		    
		    System.out.println (Pot.PotCommun);		
		    
		    @SuppressWarnings("resource")
			Scanner essaie = new Scanner(System.in);
		    System.out.println("Essayes de faire un mot:");
		    String Essai = essaie.nextLine();
		    System.out.println(Essai);
		    new Dictionnaire(Essai);
		    
		    if(Dictionnaire.result == 1){
		    	Joueur1.add(Essai);
				char lettrepioché1 = Pioche.GetPioche();
				Pot.AjoutDansPot(lettrepioché1);
			    System.out.println ("BJ, Voci vos mots réussis"+ Joueur1);
			    
			    String[] splitArray = null; //tableau de chaînes
			    String str = Essai;
			   
			    // On découpe la chaîne "str" à traiter et on récupère le résultat dans le tableau "splitArray"
			    splitArray = str.split("");
			   
			    for(int i = 0; i< splitArray.length;i++){
			     // On affiche chaque élément du tableau
			     System.out.println("élement n° " + i + "=[" + splitArray[i]+"]");
			     //String elem = new String(splitArray[i]);
			
			    }
		    }
		    else{
		    	
		    }
		    
		    
		    
		} //while
	}//main
		     
	}//class


