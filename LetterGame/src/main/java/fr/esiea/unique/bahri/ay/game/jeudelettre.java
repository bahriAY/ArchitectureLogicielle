package fr.esiea.unique.bahri.ay.game;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

import fr.esiea.unique.bahri.ay.dictionary.Dictionnaire;
import fr.esiea.unique.bahri.ay.plateforme.Pioche;
import fr.esiea.unique.bahri.ay.plateforme.Pot;

public class jeudelettre {

	public static void main(String[] args) throws FileNotFoundException {
		
		HashSet<String> Joueur1  = new HashSet<String>();
		int NbMotJ1 = Joueur1.size(); 
		boolean Piochedouble = true ;
		    
		while ( Joueur1.size() < 10){
			
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
			    System.out.println ("Bien joué! Voici vos mots trouvés"+ Joueur1);
			    
			    String[] LettresUtilisés = null; //tableau de chaînes qui comportera chaque lettres utilisé
			    String str = Essai; // le mot essayé Essai devient str	   
			    // On découpe la chaîne "str" à traiter et on récupère le résultat dans le tableau "LettresUtilisés"
			    LettresUtilisés = str.split("");
			    for(int i = 0; i< LettresUtilisés.length;i++){
			     //System.out.println("élement n° " + i + "=[" + LettresUtilisés[i]+"]");
			     String elem = new String(LettresUtilisés[i]);
			     char UsedChar = elem.charAt(0); //conversion String char
			     Pot.RetireDuPot(UsedChar); // suppression du potcomuun
			    }
		    }
		    else{
		    	/// TODO
		    }
		    
		    
		    System.out.println(Joueur1.size());
		} //while
		if(Joueur1.size() == 10){
			System.out.println("J1 a GG");
		}
	}//main
		     
	}//class


