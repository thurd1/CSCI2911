/* @author Trenton Hurd
 * @date 08 Februaru 2022
 * @assignment MethodClass1
 *
 * @algorithm
 * 1.
 * 2.
 * 3.
 */
package javaapplication6;

import java.util.*;

public class MethodClass1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello");
        messageGreeting();
        messageGreeting();
        messageGreeting();
        personalMessage("Bob");
        String studentName = "Timmy";
        personalMessage(studentName);
        String pet = "Tommy";
        int petAge = 7;
        dogInfo(pet, petAge);
        double x = 2.5;
        double y = 4.5;
        double z = 3.2;
        sumUp(1.5, 2.6, 1);
        sumUp(x, y, z);
        menu();
    }

    /**
     * messageGreeting = outputs a greeting
     */
    public static void messageGreeting() { //one word = lower case two words = the second word starts with uppercase
        System.out.println("Hello, hope you are having a great day.");
    }

    /**
     * personalMessage - outputs a personalized message
     *
     * @param name
     */
    public static void personalMessage(String name) {
        System.out.println("Hello " + name + " how are you today?");
    }

    /**
     * dogInfo - outputs dog's name, dog's age and dog's name in human years
     *
     * @param name
     * @param age
     */
    public static void dogInfo(String name, int age) {
        int humanYears = age * 7;
        System.out.println("Your dog's name is " + name + " and it is " + age + " years old in dogs years and "
                + humanYears + " years old in human years");
    }

    /**
     * sumUp - sums 3 doubles in to a sum
     *
     * @param num1
     * @param num2
     * @param num3
     */
    public static void sumUp(double num1, double num2, double num3) {

        double sum = num1 + num2 + num3;
        System.out.println("The total of " + num1 + " + " + num2 + " + " + num3 + " = " + sum);

    }
/**
 * menu - outputs a menu method to allow the user to select from
 */
    public static void menu() {
        System.out.println("Method Menu");
        System.out.println("1. Personalized greeting.");
        System.out.println("2. Sum up 3 numbers.");
        System.out.println("3. Exit");
    }
}
