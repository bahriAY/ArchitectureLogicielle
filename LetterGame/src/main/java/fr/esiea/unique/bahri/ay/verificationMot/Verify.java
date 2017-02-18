package fr.esiea.unique.bahri.ay.verificationMot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Verify {

String str = null;
static String mot;

	
public static void Comparator(String tente) throws FileNotFoundException{
@SuppressWarnings("resource")
Scanner  sc = new Scanner(new FileReader("c:/Users/Bahri/Documents/LetterGame/LetterGame/src/main/resources/dico.txt"));	
int result= 270;		

	while (sc.hasNext()) {
	     mot = sc.next();
	     String ligne = mot.toString();
	     //System.out.println(mot);
	     //System.out.println(tente);
	     
	     if(ligne.equals(tente)){
		      result = 1;
	     }
	     else{
		     result = 0;
	     }
	     
	}	
    System.out.println(result);
	
	}

	
}



