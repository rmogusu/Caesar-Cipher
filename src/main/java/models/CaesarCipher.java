package models;


import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class CaesarCipher {

    private static final int ALPHABET_SIZE = 26;

    public String getCipher(String message, int rotateBy) {
        rotateBy %= ALPHABET_SIZE;
        char[] chars = message.toCharArray();
        rotate(chars, rotateBy);
        return new String(chars);
    }
    private void rotate(char[] chars, int rotateBy) {
        for (int i = 0; i < chars.length; i++) {
            if (isLowerCase(chars[i])) {
                chars[i] = rotateChar(chars[i], rotateBy, 'a', 'z');
            } else if (isUpperCase(chars[i])) {
                chars[i] = rotateChar(chars[i], rotateBy, 'A', 'Z');
            }
        }
//    }private  char rotateChar(char c, int rotateBy, char firstChar, char lastChar) {
//
//    c += rotateBy;
//    if (c < firstChar) {
//        return (char) (c + ALPHABET_SIZE);
//    }
//    if (c > lastChar) {
//        return (char) (c - ALPHABET_SIZE);
//    }
//    return c;
//}
}
