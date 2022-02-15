/*
 * 
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class Methods {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double theAverage = average(50, 100, 150);
        System.out.println(theAverage);
        int number1 = 4;
        int number2 = 5;
        int number3 = 6;
        double result = average(number1,number2,number3/3);
        System.out.println(result);
        String users = usersName();
        System.out.println(users);
    }

    /**
     * average calculator of 3 numbers
     *
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public static double average(double num1, double num2, double num3) {
        double average = num1 + num2 + num3 / 3;
        return average;
    }
    public static String usersName(){
        Scanner keyboard = new Scanner(System.in); //scanner
        System.out.println("What is your name?"); //output
        String name = keyboard.nextLine();
        return name;
    }

}
