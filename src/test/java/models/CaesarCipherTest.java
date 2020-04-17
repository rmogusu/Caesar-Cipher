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
    @Test
    public void getCipher_shouldCipherLowerCaseLetter_cipherCharacters() {
        CaesarCipher caesar = new CaesarCipher();
        assertEquals("a", caesar.getCipher("a", 0));

        assertEquals("b", caesar.getCipher("a", 1));
        assertEquals("d", caesar.getCipher("a", 3));
        assertEquals("j", caesar.getCipher("e", 5));

        assertEquals("a", caesar.getCipher("z", 1));
        assertEquals("c", caesar.getCipher("x", 5));
    }
    @Test
    public void getCipher_shouldCipherUpperCaseLetter_cipherCharacters() {

        CaesarCipher caesar =new CaesarCipher();
        assertEquals("A", caesar.getCipher("A", 0));

        assertEquals("B", caesar.getCipher("A", 1));
        assertEquals("D", caesar.getCipher("A", 3));
        assertEquals("J", caesar.getCipher("E", 5));

        assertEquals("A", caesar.getCipher("Z", 1));
        assertEquals("C", caesar.getCipher("X", 5));
        assertEquals("Z", caesar.getCipher("C", -3));
    }
}
