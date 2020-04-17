package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaesarCipherTest {


    @Test
    public void getCipher_shouldDoNothingWithEmptyString_EmptyString() {
        CaesarCipher caesar = new CaesarCipher();
        assertEquals("", caesar.getCipher("", 3));
    }
    @Test
    public void getCipher_shouldNotCipherSymbols_symbols() {

        CaesarCipher caesar= new CaesarCipher();
        assertEquals("-", caesar.getCipher("-", 3));

        String symbols = "1!@#$%^&*(){}/";
        assertEquals(symbols, caesar.getCipher(symbols, 3));
    }
}
