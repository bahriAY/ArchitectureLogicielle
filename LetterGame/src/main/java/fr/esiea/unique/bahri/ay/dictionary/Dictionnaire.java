package fr.esiea.unique.bahri.ay.dictionary;

import java.io.File;
import java.util.Scanner;

public class Dictionnaire {
public static boolean  result;
	
public Dictionnaire(String saisie){
	 isWord(saisie);
}

public static boolean isWord(String tente){
		//result=false;
    try {

        @SuppressWarnings("resource")
		Scanner input = new Scanner( new File("c:/Users/Bahri/Documents/LetterGame/LetterGame/src/main/resources/dico.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            //System.out.println(line);
            if(tente.equals(line)){
            	System.out.println("Ce mot est bien dans le dictionnaire");
            	return true;
            }
        }
        input.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
  // System.out.println("Nombre de mots identiques dans le dictionnaire:");//
  // System.out.println(result);
return false;
   
}
	}
