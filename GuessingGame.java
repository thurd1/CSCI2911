/* @Name Trenton Hurd
 *  @date 15 Februray 2022
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
        int correct = 0, incorrect = 0;
        for (int i = 1; i <= 5; i++) {
            int computerNum = random();
            int userNum = userNumber();
            if (compare(computerNum, userNum)) {
                System.out.println("That's right");
                correct++;
            } else {
                System.out.println("Nope");
                incorrect++;
            }
        }
        System.out.println("You guessed "+correct+" out of 5correct and "+incorrect+" incorrectly out of 5");
    }

    /**
     * random - randomly generates a number between 1-100
     *
     * @return rNum
     */
    public static int random() {
        Random anyNum = new Random();
        int rNum = anyNum.nextInt(100) +0;
        return rNum;
    }

    /**
     * outputs the user to guess a number
     *
     * @return user
     */
    public static int user() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");
        while (!keyboard.hasNextInt()) {     //validates that the user enters an integer only: a..z..u..5 output: Nope
            keyboard.next();
        }
        int user = keyboard.nextInt();
        return user;
    }

    /**
     * compare - compares user to rNum to calculate if the random number equals the users guess
     * @param user
     * @param rNum
     * @return true or false
     */
    public static boolean compare(int user, int rNum) {
        if (user == rNum) {
            return true;
        } else {
            return false;
        }
    }
    public static int userNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");//output
        int user = -1; //ininitalize user to be an invalid number <0 or >100
        while (user < 1 || user > 100) {
            System.out.println("Enter only numbers between 1-100"); //output
            String input = keyboard.nextLine(); //takes input as a string
            try {
                user = Integer.valueOf(input); //checks to see if input is an integer. If it isn't goes to catch clause
            } catch (NumberFormatException e) {
                user = -1; //sets user to an invalid number to make loop repeat
            }
        }
        return user;
    }
}

