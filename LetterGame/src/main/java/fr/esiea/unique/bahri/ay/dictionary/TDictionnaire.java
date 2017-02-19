package fr.esiea.unique.bahri.ay.dictionary;

import java.io.File;
import java.util.Scanner;

public interface TDictionnaire {
	 
    static boolean isWord(String word) {
    	
        try {

            @SuppressWarnings("resource")
			Scanner input = new Scanner( new File("c:/Users/Bahri/Documents/LetterGame/LetterGame/src/main/resources/dico.txt"));

            while (input.hasNextLine()) {
                String line = input.nextLine();
                //System.out.println(line);
                if(word.equals(line)){
                	return true;
                }
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    	return false;
	}
}
