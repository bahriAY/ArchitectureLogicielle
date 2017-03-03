package fr.esiea.unique.bahri.ay.joueur;

import java.util.HashSet;

public class DefPlayer {
	public static int joueurId;
	public static HashSet<String> JoueurActif;
	public static String nom;
	public  DefPlayer(boolean Jeton){
		
		if( Jeton){
			joueurId=1;
			JoueurActif= Player.Joueur1;
			nom = "Joueur 1";
			
		}
		else{
			joueurId=2;
			JoueurActif= Player.Joueur2;
			nom = "Joueur 2";
		}
		
		return;
		}
	}
	

