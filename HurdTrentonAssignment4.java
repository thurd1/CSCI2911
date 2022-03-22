/* @author Trenton Hurd 
 * @date 04 February 2022
 * @assignment 4
 * 
 * Algorithm:
 * 1. Display the File Operations Menu
 * 2. If user selects 1 then asks how many weeks
 * 3. Loop the amount of weeks the user enters.
 * 3. Save users sales figures to a file (sales.txt)
 * 4. Reads users sales figures from sales.txt file
 * 5. Totals users sales figures and writes them in sales.txt
 * 6. Exits the program by closing the file when the user inputs the number 4
 * 7.
 */
package javaapplication6;

import java.io.*;
import java.util.*;

public class HurdTrentonAssignment4 {

    public static void main(String[] args) throws IOException {

        double number;
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        int i = 0;
        int weeks;
        double sales=0;
        System.out.println("***File Operations Menu***"); //prompts the user to enter a whole number
        System.out.println("1. Enter Sales Figures \n2. Display Sales Figures\n3. Display Total Sale\n4. Exit Program ");
        number = keyboard.nextInt();

        if (number == 1) //if user enters 1
        {
            PrintWriter outputFile = new PrintWriter("sales.txt"); //open file;
            System.out.println("How many weeks of Sales Figures do you have to enter?"); //asks users for how many weeks they want to enter
            weeks = keyboard.nextInt(); //the amount of weeks the user wants to enter
            for (i = 1; i <= weeks; i++) //for loop
            {
                System.out.println("Enter week number "
                        + i + " sales "); //prompts each week for sales
                sales = keyboard.nextDouble(); //sales input
                outputFile.println(sales);//print to file
              }
            outputFile.close();
        } else if (number == 2) { //if user enters 2
            File fileName = new File("sales.txt"); //open file for reading
            Scanner outputFile = new Scanner(fileName); //open file
            while(outputFile.hasNext()) {
            sales = outputFile.nextDouble();
            System.out.println(sales); //print to file
            
        }
            outputFile.close(); //closes file
} 
        else if (number == 3) { //if user enters 3
            PrintWriter outputFile = new PrintWriter("Sales.txt"); //open file
           FileWriter inputFile = new FileWriter("sales.txt", true); //allows to append an exisiting file
           sum = sum + sales; //sum + sales
            outputFile.println(sum); //output
            inputFile.close();
        }
        else if(number == 4){ //if user enters 4
            System.exit(0);
        }
    }

}

