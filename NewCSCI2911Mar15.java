/* @author Trenton Hurd
 * @date 
 * Assignment: HurdTrenton
 * 
 * Algorithm:
 * 1. 
 * 2.
 * 3. 
 * 4. 
 * 5. 
 * 6. 
 * 7. 
 * 8. 
 */
package javaapplication6;

import java.util.*;

public class NewCSCI2911Mar15 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] lunchPrices = new double[5]; //array is good for using the same data type multiple times

        /*
        lunchPrices[1] = 5.02; //Tuesday lunch cost
        lunchPrices[2] = 5.03; //Wednesday lunch cost
        lunchPrices[3] = 5.04; //Thursday lunch cost
        lunchPrices[4] = 5.05; //Friday lunch cost
         */
        double sum = lunchPrices[0] + lunchPrices[1] + lunchPrices[2] + lunchPrices[3] + lunchPrices[4];
        double increase = lunchPrices[4] * .2 + lunchPrices[4];

        System.out.println("Total lunch costs for the whole week " + sum); //output the cost of lunches for the whole week

        System.out.println("Friday lunch costs " + lunchPrices[4]); //output the cost of lunch on Friday

        System.out.println("Friday lunch costs " + lunchPrices[2]); //output the cost of lunch on Wedneday

        System.out.println(increase); //outputs the cost of lunch prices for Friday increased 20%

        for (int i = 0; i < lunchPrices.length; i++) {
            System.out.println("Day " + (i + 1) + " = $" + lunchPrices[i]);
        }
        for (int e = 0; e < lunchPrices.length; e++) {
            System.out.println("How much was the lunch on day " + (e + 1) + "?");
            lunchPrices[e] = keyboard.nextDouble();
        }
        double[] dinnerPrices = (25.5, 13.3, 123.45, 555.5, 1231.11);
        for (int o = 0; o < dinnerPrices.length; o++);
    }

}
