/*
 * 
 *
 * 
 */
package javaapplication6;

import java.util.*;

public class newCSCI2911Mar24 {

    public static void main(String[] args) {
        ArrayList<Double> breakfastCosts = new ArrayList<Double>(5);
        breakfastCosts.add(5.5);
        breakfastCosts.add(10.10);
        breakfastCosts.add(15.15);
        breakfastCosts.add(20.20);
        breakfastCosts.add(25.25);

        double searchNumber = 5.99;
        found(searchNumber, breakfastCosts);

        System.out.println(breakfastCosts);

        outputA1(breakfastCosts);

        outputA1(numbers());

        for (int i = 0; i < breakfastCosts.size(); i++) {
            System.out.println(breakfastCosts);
        }

        for (Double a : breakfastCosts);
        {
            System.out.println(breakfastCosts);
        }

        breakfastCosts.add(0, 3.50);
        System.out.println(breakfastCosts);

        breakfastCosts.add(3, 3.99);
        System.out.println(breakfastCosts);

        breakfastCosts.remove(0);
        System.out.println(breakfastCosts);

        System.out.println("Number of elements in ArrayList: " + breakfastCosts.size());
        //breakfastCosts.clear();

        System.out.println(breakfastCosts);

        Collections.sort(breakfastCosts);
        System.out.println(breakfastCosts);

    }

    public static void outputA1(ArrayList<Double> list) {
        for (Double a : list) {
            System.out.println(a);
        }
    }

    public static ArrayList<Double> numbers() {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(4.5);
        list.add(5.0);
        return list;
    }

    public static void found(double number, ArrayList<Double> list) {
        if (list.contains(number)) {
            System.out.println(number + " is in the list");
        } else {
            System.out.println(number + " is not in the list");
        }
    }
}
