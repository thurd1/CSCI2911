/*
 * 
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class newCSCI2911Mar22 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double[] dinners = {0, 1, 2, 3, 4, 5, 6}; //0. Mon; 1. Tue; 2. Wed; 3. Thur; 4.Fri; 5. Sat; 6. Sun
        System.out.println("Wednesday dinner cost $" + dinners[2]); //costs of dinner on Wednesday
        /*
        for (int i = 0; i < dinners.length; i++) { //for loop that loops through everysingle day to out the price of dinner that day
            System.out.println(dinners[i]); //outputs the costs of dinners for every single day
        }

        for (double cost : dinners) { //enhanced for loop
            System.out.println(cost); //outputs thel costs for everysingle day
        }
         */
        double[] book = getArray();
        for (int i = 0; i < book.length; i++) {
            Arrays.sort(book);
            System.out.println(book[i]);
        }
        /*
        displayArray(dinners);

        displayArray(getArray());

        double[] copiedArray = copyArray(dinners); //copies the array 
        
        displayArray(copyArray(dinners)); 
        
        displayArray(copiedArray); //displays the copy 
         */
        String[] names = {"Timmy", "Tommy", "Billy", "Bobby", "Terry", "William"};
        for (int i = 0; i < names.length; i++) {
            Arrays.sort(names);
            System.out.println(names[i]);
        }

        System.out.println(Arrays.toString(dinners)); //converts dinners to a String

        System.out.println(Arrays.toString(names)); //converts names to aString

        double searchValue = 4;
        if (Arrays.binarySearch(dinners, searchValue) < 0) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }

        if (Arrays.binarySearch(names, "William") < 0) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found");
        }
    }

    /**
     * getArray - returns bookPrices array to main
     *
     * @return
     */
    public static double[] getArray() {
        double[] bookPrices = {25.69, 42, 40, 56.89, 98.06};//book prices
        return bookPrices; //returns bookPrices to main
    }

    /**
     * displayArray - displays the array in main
     *
     * @param array
     */
    public static void displayArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void displayArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * copyArray - copies an array
     *
     * @param array
     * @return
     */
    public static double[] copyArray(double[] array) {
        double secondArray[] = new double[array.length]; //this allows the user to copy w/e. We don't know what's being passed to it yet but it will take the length
        for (int i = 0; i < array.length; i++) {
            secondArray[i] = array[i];
        }
        return secondArray;
    }
}
