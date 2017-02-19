package fr.esiea.unique.bahri.ay.dictionary;

import java.io.File;
import java.util.Scanner;

public class Dictionnaire {
	public static int  result=270;
	
	public Dictionnaire(String tente){
		result=0;
    try {

        Scanner input = new Scanner( new File("c:/Users/Bahri/Documents/LetterGame/LetterGame/src/main/resources/dico.txt"));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            //System.out.println(line);
            if(tente.equals(line)){
            	result = 1;
            }
        }
        input.close();

    } catch (Exception ex) {
        ex.printStackTrace();
    }
   System.out.println("Nombre de mots identiques dans le dictionnaire:");
   System.out.println(result);
   
}
	}
