/*
 * @author Trenton Hurd
 * @date 28 January 2022
 * Assignment:
 *
 * Algorithm
 * 1. Prompt the user for a message that they would like to encrypt
 * 2. Ask the user for the key that they would like to use
 * 3. Loop the message to look at each character one at a time
 * 4. Shift only letters (not special characters or spaces)
 * 5. Wrap around 
 * 6. Output the prompted message using the provided key
 */
package csci2916;

import java.util.*;

public class HurdTrentonAssignment3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a message that you would like to be encrypted!"); //prompts user for the message
        String user = keyboard.nextLine(); //encryptedMessage will be what the user enters
        System.out.println("What would you like the key to be?"); //prompts user for the key
        int shift = keyboard.nextInt(); //userKey will be the key the user wants

        
        for (int i = 0; i < user.length(); i++) {
            char letter = user.charAt(i); //starts the encyption at the first position (0)
            if (letter >= 'A' && letter <= 'Z') {
                int newLetter = (int) letter + shift;
                if (newLetter > 'Z') {
                    newLetter = newLetter - 26;
                }
                System.out.print((char) newLetter);
            } else if (letter >= 'a' && letter <= 'z') {
                int newLetter = (int) letter + shift;
                if (newLetter > 'z') {
                    newLetter = newLetter - 26; }
                    System.out.print((char) newLetter);

            } else {
                    System.out.print(letter);
                }

            }
            }
    }
        
    
