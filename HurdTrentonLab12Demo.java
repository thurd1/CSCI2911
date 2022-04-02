/*
 * 
 *
 * 
 */
package csci2916;

import java.util.*;

public class HurdTrentonLab12Demo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int year;
        String make;
        
        System.out.println("Enter the year of your Motorcycle (1900-2022)");//output the question for year
        year = inputValidation(); //validates that year is ant int and betwee 1900-2022
        
        System.out.println("Enter the make of your Motorcycle (such as Harley, Kawasaki)"); //output the question for make
        make = keyboard.nextLine(); //scanner for make
        
        Motorcycles user = new Motorcycles(make, year);
        
        System.out.println(user.toString());
    }

    public static int inputValidation() {
        Scanner keyboard = new Scanner(System.in);

        int year = 0; //userAnswer starts at 0
        boolean valid = false;
        do {
            while (!keyboard.hasNextInt()) {
                System.out.println("Invalid. Please enter a number between 1900-2022."); //output if the user enters a non-int
                keyboard.nextLine(); //loops until the user enters a correct int
            }
            year = keyboard.nextInt();
            if (year > 1899 && year < 2023) {
                valid = true;
            } else {
                System.out.println("Invalid. Enter the year of your Motorcycle (1900-2022)."); //output if the user enters anything below 1900 and above 2022
                keyboard.nextLine(); //loops theuser to enter a valid int
            }
        } while (!valid);
        return year; //returns year to main()
    }

    /*
    public static void speed(int speed){
        for(int i =0; i > 2; i++){
            System.out.println(speed = 5 * i);
        }
    }
*/
    
}
