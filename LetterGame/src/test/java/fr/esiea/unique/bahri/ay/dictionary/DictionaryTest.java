package fr.esiea.unique.bahri.ay.dictionary;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {

    @Before
    public void setup() {
        //TODO
    	
    }

    @Test
    public void testIsWord() {
        assertTrue(Dictionnaire.isWord("maman"));
        assertFalse(Dictionnaire.isWord("namam"));
    }
}
