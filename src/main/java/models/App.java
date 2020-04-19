package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("+-----------------------------------------------------------+");
            System.out.println("|                                                           |");
            System.out.println("| Welcome to our caesar Cipher . What would you like to do? |");
            System.out.println("|                                                           |");
            System.out.println("| Enter one of the following options: Cipher, Decipher      |");
            System.out.println("|                                                           |");
            System.out.println("|    or Exit                                                |");
            try {
                String userChoice = bufferedReader.readLine();

                switch (userChoice) {
                    case "Cipher": {
                        System.out.println("|    Enter  your text:                                       |");
                        String stringUserText = bufferedReader.readLine();
                        System.out.println("|    Enter your rotational key:                             |");
                        String integerUserKey = bufferedReader.readLine();
                        int alphabetRotationKey = Integer.parseInt(integerUserKey);
                        CaesarCipher caesar = new CaesarCipher();
                        String textMessage = caesar.getCipher(new String(stringUserText), (alphabetRotationKey));
                        System.out.println("Your result is: " + textMessage.toUpperCase() + " thank you for using Caesar Cipher");
                        System.out.println("+-----------------------------------------------------------+");

                        break;
                    }
                    case "Decipher": {
                        System.out.println("|    Enter your text:                                       |");
                        String stringUserText = bufferedReader.readLine();
                        System.out.println("|    Enter your rotational key:                             |");
                        String integerUserKey = bufferedReader.readLine();
                        int alphabetRotationKey = Integer.parseInt(integerUserKey);
                        CaesarCipher caesar = new CaesarCipher();
                        String textMessage = caesar.getCipher(new String(stringUserText), -(alphabetRotationKey));

                        System.out.println("Your result is: " + textMessage.toUpperCase() + " thank you for using Caesar Cipher");
                        System.out.println("+-----------------------------------------------------------+");
                        System.out.println("|                                                           |");
                        System.out.println("|             Made By Rose                                  |");


                        break;
                    }
                    case "Exit":
                        System.out.println("Goodbye!");
                        programRunning = false;

                        break;
                    default:
                        System.out.println("I'm sorry, we don't recognize your input");
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
