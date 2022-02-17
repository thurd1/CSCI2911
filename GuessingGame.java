/* @Name Trenton Hurd
 *  @date 15 Februray 2022
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class GuessingGame {

    public static void main(String[] args) {
        int computerNum = random();
        int userNum = user();
        if(compare(computerNum,userNum)){
            System.out.println("That's right");
        }
        else{
            System.out.println("Nope");
        }
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
}

