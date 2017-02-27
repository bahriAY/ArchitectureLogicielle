package fr.esiea.unique.bahri.ay.verificationMot;

//import fr.esiea.unique.bahri.ay.game.jeudelettre;

import java.util.HashSet;
import java.util.Iterator;

public class VerifyUnicity {
public static boolean unique;



	public VerifyUnicity(String essai, HashSet<String> Joueur1){
		
		//parcourir le hashset Joueur1
		// comparer chaque mot avec essai
		// si un mot == essai alors unique= true;
		//unique = false;
		
	
		@SuppressWarnings("rawtypes")
		Iterator e = Joueur1.iterator();
		//System.out.println("verif blocage");
		unique=true;
		if(Joueur1.size() != 0){
			//System.out.println("verif blocage 2");
			while(e.hasNext()){
				//System.out.println("verif blocage 3");
				  if (Joueur1.contains(essai)){
					  unique = false;
					  System.out.println("Ce mot a déjà été trouvé");
				  }
				  else{
					  unique = true;
					  System.out.println("Ce mot est unique");
					  
				  }
				  e.next();
			}
			
		} 


		

		
			
	}
}
