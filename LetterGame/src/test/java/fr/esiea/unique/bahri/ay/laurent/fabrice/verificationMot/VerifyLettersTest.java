package fr.esiea.unique.bahri.ay.laurent.fabrice.verificationMot;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fr.esiea.unique.bahri.ay.plateforme.Pot;
import fr.esiea.unique.bahri.ay.verificationMot.VerifyLettres;
public class VerifyLettersTest {
	
	
	@Test 
	public void AreLettersInPotCom(){
		Pot.PotCommun.add('b'); // on ajoute b dans le pot commun
		
        assertTrue(VerifyLettres.AreLetters("b")); 
        // on a testé si il y à "b" dans le pot
        
        assertFalse(VerifyLettres.AreLetters("bar"));
        // Si y'a toute les lettre du string "bar" dans le pot commun
	}
}
