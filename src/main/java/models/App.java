package models;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println( "+-----------------------------------------------------------+" );
            System.out.println( "|                                                           |" );
            System.out.println("| Welcome to our caesar Cipher . What would you like to do? |");
            System.out.println( "|                                                           |" );
            System.out.println("| Enter one of the following options: Cipher, Decipher      |");
            System.out.println( "|                                                           |" );
            System.out.println( "|    or Exit                                                |" );
        }
    }
}