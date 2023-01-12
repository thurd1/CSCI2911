/*
 * 
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean valid = true;
        String score;
        String grade 1 = "A";
        int[] userScore = new int[4];
        int sum = userScore[0] + userScore[1] + userScore[2] + userScore[3];
        double average = sum / 5;
        if (userScore[0] >=90)
        {
            grade1;
        }
        for (int i = 0; i < userScore.length; i++) {
            System.out.println("New Score? " + (i + 1));
        }
        System.out.println("The average score is " + average);
        System.out.println("The letter grade ");
        System.out.println(grade1);

        while (!valid) {
            System.out.println("That number is invalid. Please try again."); //output
            score = keyboard.nextLine(); //prompts the user to enter a valid number
            valid = validateUserScore(score); //verifies that the user enter a correct number

        }
    }

    public static boolean validateUserScore(String score) {
        return score.matches("[0-100]");  //checks that the number is a grade between 0 and 100
    }

}
