/* @Name: Trenton Hurd
 * @Date: 15 Februray 2022
 * Assignment: HurdProgramAssignment6
 *
 * Algorithm
 * 1. Output asks the users to input enter rock, paper, or scissors. 
 * 2. Accepts the users input if it's valid and compares it to the generated computers input
 * 3. Output who selected what
 * 4. Output who won between the user and the computer and how. IE: Paper covers rock, rock beats scissors, etc.
 * 5. If there is a tie, loop until there is a winner
 */
package javaapplication6;

import java.util.*;

public class HurdProgramAssignment6 {

    public static void main(String[] args) {
        int gNum, rNum;
        String outcomeA;
        do {
            rNum = randomComp();
            gNum = userGuess();
            outcomeA = outcome(rNum, gNum);
            System.out.println("The computer chose " + choice(rNum)); //output from the randomly generated computer number 
            System.out.println("The user chose " + choice(gNum)); //output from the user choice
            if (rNum == gNum) {
                System.out.println("It's a tie. Try again."); //output 
            }
        } while (rNum == gNum);
        System.out.println("The outcome is " + outcomeA); //output of the tie

    }

    /**
     * randomComp - randomly generated number between 1-3
     * @return rNum 
     */
    public static int randomComp() {
        Random anyNum = new Random();
        int rNum = anyNum.nextInt(3) + 1;
        return rNum; //rNum is returned in main
    }

    /**
     * userGuess - the users guess between 1-3
     * @return gNum
     */
    public static int userGuess() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("JanKenPo! Only enter 1 for rock, 2 for paper, or 3 for scissors"); //output menu
        int gNum = keyboard.nextInt();
        return gNum;//gNum is returned in main
    }

    /**
     * outcome - the outcome of who won the rock paper scissors match
     * @param userRandom 
     * @param computerRandom
     * @return output statements depending on the if statements
     */
    public static String outcome(int userRandom, int computerRandom) {
        if (userRandom == 1 && computerRandom == 2) {
            return "Paper beats rock! Computer wins!"; 
        } else if (userRandom == 1 && computerRandom == 3) {
            return "Rock beats scissors! User wins!";
        } else if (userRandom == 2 && computerRandom == 1) {
            return "Paper beats rock! User wins!";
        } else if (userRandom == 2 && computerRandom == 3) {
            return "Scissors beats paper! Computer wins!";
        } else if (userRandom == 3 && computerRandom == 1) {
            return "Rock beats scissors! Computer wins!";
        } else {
            return "Scissors beat paper! User wins!";
        }
    }

    /**
     * choice - the choice returns the corresponding action
     * @param choice
     * @return
     */
    public static String choice(int choice) {
        if (choice == 1) {
            return "rock";
        } else if (choice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

}
