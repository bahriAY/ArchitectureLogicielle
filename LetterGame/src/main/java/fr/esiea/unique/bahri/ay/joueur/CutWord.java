package fr.esiea.unique.bahri.ay.joueur;

public class CutWord {
		public static String[] TableauLettres = null; //tableau de chaînes qui comportera chaque lettres utilisé    	

	public CutWord(String motàcouper){
		
    String str = motàcouper; // le mot essayé Essai devient str	
    TableauLettres = str.split(""); //on decoupe le string
	}
}
	
