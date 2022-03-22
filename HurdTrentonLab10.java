/* @author Trenton Hurd
 * @date 18 March 2022
 * Assignment: HurdTrentonLab10
 * 
 * Algorithm:
 * 1. Create two arrays. One array will hold the names of the candy bar and the other will hold the prices of the candy bar.
 * 2. Take in the names of the candy bars and outputs them.
 * 3. Take in the name and cost of the candy bars and prints them out.
 * 4. Take in the cost of the candy bars and returns the total cost of the candy bars combined.
 * 5. Take in the cost of the candy bars and returns the average cost of the 5 casdy bars.
 * 6. Take in the names of the candy bards and outputs one randomly.
 */
package csci2916;

import java.util.*;

public class HurdTrentonLab10 {

    public static void main(String[] args) {
        String[] candyBars = {"Reescees", "Chocolate Panda's", "Skittles", "Liccorice", "Starburst"}; //string array of favorite candy bars

        double[] candyPrices = {2.50, 3.00, 3.50, 4.00, 4.50}; //double array of  costs of favorite candy bars

        System.out.print("My favorite Easter Candy\n"); //output
        printCandy(candyBars); //prints out the list of candy bars
        System.out.print("Favorite Easter Candy   Cost\n"); //output
        printAll(candyBars, candyPrices); //prints out the list of candy bars and the costs side by side
        double total = totalCost(candyPrices); //total from method totalCost from the list candyPrices
        System.out.print("If I were to purchase all the candy it would cost me $" + total+"\n"); //outputs the total cost of the candy bars from method totalCost()
        double average = averageCost(candyPrices); //average from method averageCost from the list candyPrices
        System.out.print("The average cost of the candy bars is $" + average+"\n"); //averages the cost of candy bars from method averageCost()
        String random = randomCandy(candyBars);
        System.out.print("Select a random candy: " + random+"\n"); //randomly prints out a candy bar from method randomCandy()
    }

    /**
     * printCandy - prints out the names of the candy bars
     *
     * @param candyBars
     */
    public static void printCandy(String[] candyBars) {
        for (int i = 0; i < candyBars.length; i++) { //loops the candy bar list until they are all printed
            System.out.println(candyBars[i]); //prints out the candy bar list
        }
    }

    /**
     * printAll - Prints outs the candy bars with the cost of each candy bar
     *
     * @param candyBars
     * @param candyPrices
     */
    public static void printAll(String[] candyBars, double[] candyPrices) {
        for (int i = 0; i < candyBars.length; i++) { //loops the candy bars and costs until they are all printed
            System.out.println(candyBars[i] + " " + candyPrices[i]); //Name of candy bar + price of candy bar
        }
    }

    /**
     * totalCost - Totals the cost of all candy bars
     *
     * @param candyPrices
     * @return
     */
    public static double totalCost(double[] candyPrices) {
        double total = 0; //initialize accumulator
        for (int i = 0; i < candyPrices.length; i++) { //loops for each candy bar cost
            total += candyPrices[i]; //keeps the running total of candy bar prices
        }
        return total;
    }

    /**
     * averageCost - Averages the costs of all candy bars
     *
     * @param candyPrices
     * @return
     */
    public static double averageCost(double[] candyPrices) {

        return totalCost(candyPrices) / candyPrices.length; //total cost of candy bar prices divided by the amount (length) of candy bars
    }

    /**
     * randomCandy - Pick a random number between 0-4 to pick a random candy bar
     *
     * @param rNum
     * @return
     */
    public static String randomCandy(String[] candyBars) {
        Random anyCandyBar = new Random(); //any random
        int number = anyCandyBar.nextInt(5); //any random number between 0-5
        return candyBars[number]; //returns the random number to select a candy bar
    }

}
