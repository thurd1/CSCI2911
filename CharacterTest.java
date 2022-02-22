/*
 * 
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class CharacterTest {

    public static void main(String[] args) {
        String name = vertical();
        System.out.println(name);
        backward("Timmy");
        verticalPrint("\nMary");
        countL("Frank");
        countN("1000");
        count("Hello123");
    }

    public static void input(char ch) {
        Scanner keyboard = new Scanner(System.in);
        //Get a character from the user and store it in the ch variable.
        System.out.println("Enter any single character");
        String input = keyboard.nextLine();
        ch = input.charAt(0);
        System.out.println("ch");
        //test the chracter
        if (Character.isLetter(ch)) {
            System.out.println("That is a letter.");
        }
        if (Character.isDigit(ch)) {
            System.out.println("That is a digit");
        }
        if (Character.isLowerCase(ch)) {
            System.out.println("That is a lowercase letter.");
        }
        if (Character.isUpperCase(ch)) {
            System.out.println("That is an uppercase letter.");
        }
    }

    public static String vertical() {
        String name = "Timmy";
        for (int i = 0; i < 5; i++) {
            System.out.println(name.charAt(i));
        }
        return name;
    }

    public static void backward(String phrase) {
        for (int i = phrase.length() - 1; i > 0; i--) {
            System.out.print(phrase.charAt(i));
        }
    }

    public static void verticalPrint(String word) {
        for (int e = 0; e < word.length(); e++) {
            System.out.println(word.charAt(e));
        }
    }

    public static void countL(String letters) {
        int howManyL = letters.length();
        System.out.println("There are " + howManyL + " letters");
    }

    public static void countN(String numbers) {
        int howManyN = numbers.length();
        System.out.println("There are " + howManyN + " numbers");
    }

    public static void count(String words) {
        int countOfLetters = 0;
        int countOfNumbers = 0;
        char letter;
        for (int i = 0; i > words.length(); i++) {
            letter = words.charAt(i);
            if (Character.isLetter(letter)) {
                countOfLetters++;
            } else if (Character.isDigit(letter)) {
                countOfNumbers++;
            }
        }
        System.out.println("There are " + countOfLetters + " number of letters. ");
        System.out.println("There are " + countOfNumbers + " number of digits.");
    }
}
