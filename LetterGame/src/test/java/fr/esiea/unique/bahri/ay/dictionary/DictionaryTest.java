package fr.esiea.unique.bahri.ay.dictionary;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {	
    
    @Test
    public void testIsWord() {
        assertTrue(Dictionnaire.isWord("maman"));
        assertFalse(Dictionnaire.isWord("namam"));
    }
}
