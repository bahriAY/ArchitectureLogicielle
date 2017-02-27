package fr.esiea.unique.bahri.ay.laurent.fabrice.verificationMot;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.esiea.unique.bahri.ay.joueur.Player;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyUnicity;

public class VerifyUnicityTest {

	
	@Test
	public void IsWordAlreadyExistsInJoueur(){
	
	Player.Joueur1.add("je"); // Ajout de "je" dans la liste des mots trouvé du J1
	new VerifyUnicity("je", Player.Joueur1);// Je verifie si le mot a déjà été trouvé(ajouté)
    assertFalse(VerifyUnicity.unique); 
   
    
	new VerifyUnicity("tu", Player.Joueur1);  // je verifie si tu est déjà dans le tableau
	assertTrue(VerifyUnicity.unique);
	
	}
}
