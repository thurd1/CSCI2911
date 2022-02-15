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
     * randomly generates a number between 1-100
     *
     * @return
     */
    public static int random() {
        Random anyNum = new Random();
        int rNum = anyNum.nextInt(100) +0;
        return rNum;
    }

    /**
     * outputs the user to guess a number
     *
     * @return
     */
    public static int user() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number between 1-100");
        int user = keyboard.nextInt();
        return user;
    }

    /**
     * compares user to rNum to calculate if the random number equals the users guess
     * @param user
     * @param rNum
     * @return
     */
    public static boolean compare(int user, int rNum) {
        if (user == rNum) {
            return true;
        } else {
            return false;
        }
    }
}

