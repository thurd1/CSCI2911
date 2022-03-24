/*
 * @author Trenton Hurd
 * @date 23 March 2022
 * @assignment: HurdTrentonAssignment3
 * Algortithm: 
 * 1. Display a menu to the user
 * 2. addName 
 * 3. 
 * 4. 
 * 5. 
 * 6. 
 * 7. 
 */
import java.util.*;

public class HurdTrentonAssignment3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        menu();
        int userAnswer = keyboard.nextInt();
        if (userAnswer == 1) {
            namesArray();
        } else if (userAnswer == 2) {
           namesArray(displayArray());
            System.out.println("Your friends are: ");
            for (int i = 0; i < names.length; i++) {
                System.out.println(names[i]);

            }
        } else if (userAnswer == 3) {
            System.out.println("What name are you looking for? ");
          
            String nameLooking = keyboard.nextLine();
            if(Arrays.binarySearch() < 0;{
            System.out.println("Not Found");
        } else{
                System.out.println("Found");
                }
        } else if (userAnswer == 4) {
            System.out.println(Arrays.toString(namesArray()));
        } else if (userAnswer == 5) {
            System.out.println(Arrays.asList(namesArray()));
        } else if (userAnswer == 6) {
            System.out.println("Good bye");
            System.exit(0);
        }/*
        while (userAnswer >= 7) {
            System.out.println("Invalid. Please enter a selection between 1-6.");
            userAnswer = keyboard.nextInt();
        }
         */
    }

    public static void menu() {
        System.out.println("The Names Menu\n"
                + "*********************************\n"
                + "1. Add Names\n"
                + "2. Print out all names\n"
                + "3. Search for name in the list\n"
                + "4. Print out all names sorted\n"
                + "5. How many names are in the list?\n"
                + "6. Exit\n"
                + "*********************************");
    }

    /**
     *
     * @return
     */
    public static String[] namesArray() {
        Scanner keyboard = new Scanner(System.in);
        int namesAdd;
        System.out.println("How many names would you like to enter? Only enter an integer."); //Output
        namesAdd = keyboard.nextInt();

        String[] names = new String[namesAdd];
        for (int i = 0; i < namesAdd; i++) { //Loops as many times as the users wants to add friends
            System.out.println("Enter the name of friend " + (i + 1)); //Output + adds 1 to each friend the user wants to add
            names[i] = keyboard.next(); //stores the names of user entered friends
        }
        return names;//returns the list of friends to main
    }

    public static void displayNames(String[] names) {
        System.out.println("Your friends are: ");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public static void searchNames() {

    }

    public static void listNames() {

    }
}
