package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {


    @Test
    public void getCipher_shouldDoNothingWithEmptyString_EmptyString() {
        CaesarCipher caesar = new CaesarCipher();
        assertEquals("", caesar.getCipher("", 3));
    }

}
