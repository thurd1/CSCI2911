/* @author Trenton Hurd
 * @date 02/01/2022
 * @assignment CSCI2911Feb1
 *
 * Algorithm:
 * Repeat Happy Chinese New Year 50 times.
 * Repeat
 *
 */
package javaapplication6;

import java.util.*;

public class CSCI2911Feb1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int i = 1; //STARTING VALUE OF I
        while (i <= 50) //REPEATS THE BELOW OUTPUT 50 TIMES UNTI i IS EQUAL TO 50
        {
            System.out.println("Happy Chinese New Year"); //OUTPUT
            System.out.println("The year of the Tiger");//OUTPUT
            i++; //STARTS THE COUNTER FROM 1 TO 50 UNTIL THEY ARE EQUAL
        }
        int x = 50; //STARTING VALUE OF X
        while (x > 0) //REPEATS THE BELOW STATMENT UNTIL THE X IS GREATER THAN 50
        {
            System.out.println("Hello"); //OUTPUT
            x--; //STARTS THE COUNTER FROM 50 AND GOES TO 0
        }
        for (int a = 1; a <= 50; a++) //a = 1 and a will add 1 each time until the condition is equal to 50
        {
            System.out.println("*********************"); //OUTPUT
            System.out.println("Happy Chinese New Year"); //OUTPUT
            System.out.println("The year of the the Tiger"); //OUTPUT
        }
        int c = 1; // C = 1
        do { //LOOP
            System.out.println("Happy Chinse New Year"); //OUTPUT
            c++; //COUNTER 
        } while (c <= 50); //THE ONLY LOOP THAT HAS A SEMICOLON

        int answer;
        do {
            System.out.println("1. Happy New Year (English) "); //OUTPUT
            System.out.println("2. Happy New Year (Chinese) "); //OUTPUT
            System.out.println("3. Exit. "); //OUTPUT
            System.out.println("Enter numbers 1, 2 or 3 "); //OUTPUT
            answer = keyboard.nextInt(); //USER ANSWER AS A NUMBER
            if (answer == 1) { //IF USERANSWER = 1 THEN OUTPUT BELOW STATEMENT
                System.out.println("Happy New Year"); //OUTPUT 
            } else if (answer == 2) { //IF USERANSWER = 2 THEN OUTPUT BELOW STATEMENT
                System.out.println("恭喜发财"); //OUTPUT
            } else if(answer == 3) //IF USERANSWER = 3 THEN OUTPUT BELOW STATEMENT
            {
                System.out.println("Goodbye."); //OUTPUT
            System.exit(0); //IF USER ANSWER IS ANYTHING BUT 1,  2, OR 3, EXIT THE PROGRAM
            }
        } while (answer !=3); //IF ANSWER DOES NOT = 3 REPEAT THE MENU
        
        String user = "";
        int l = 0;
        int stop;
        stop = user.length();
        System.out.println("What word would you like to output vertically?");
        user = keyboard.nextLine();
        while(l<50)
        {
            System.out.println(user.charAt(l));
            l = l + 1;
        }

    }

}
