/*
 * @author Trenton Hurd
 * @date 26 March 2022
 * @assignment: HurdTrentonAssignment3
 * Algortithm: 
 * 1. Display a menu to the user for them to pick from
 * 2. Option 1 - a method that takes an ArrayList as an argument, asks the user how many names to add, ask for each name, and add to the array list.
 * 3. Option 2 - a method that takes an ArrayList as an argument and prints out each name in the ArrayList
 * 4. Option 3 - a method that searches for a specific name, asks the user what name they want to search for and output whether the name is on the list or not
 * 5. Option 4 - a method that outprints all the names and sorts them
 * 6. Option 5 - a method that outputs how many names are in the ArrayList
 * 
 */
import java.util.*;

public class HurdTrentonAssignment3a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //scanner
        ArrayList<String> array = new ArrayList<String>(); //ArrayList
        int userAnswer = 0; //userAnswer initialized at 0
        while (userAnswer != 6) { //loops the menu when the user does not enter 6 to end the program
            menu(); //outputs the menu
            userAnswer = inputValidation();
            if (userAnswer >= 7 || userAnswer <= 0) {
                System.out.println("Invalid. Please enter a selection between 1-6."); //output if the user enters anything below 0 or after 7
                userAnswer = inputValidation(); //validates the userAnswer to validate that it is between 1 and 6
            }
            if (userAnswer == 1) { //if the user picks option 1
                namesArray(array);
            } else if (userAnswer == 2) { //if the user picks option 2
                displayNames(array);
            } else if (userAnswer == 3) { //if the user picks option 3
                searchNames(array);
            } else if (userAnswer == 4) { //if the user picks option 4
                System.out.println("Names in order: " + array.toString()); //converts the array and outputs it as a String
            } else if (userAnswer == 5) { //if the user picks option 5
                System.out.println("Number of names in the ArrayList is: " + array.size()); //array.size shows many names are in the ArrayList
            } else if (userAnswer == 6) { //if the user picks option 6
                System.out.println("Good bye"); //output
                System.exit(0); //ends the program
            }
            System.out.println(""); //gives a space after menu to make the output more neat

        }
    }

    /**
     * menu - This is the menu that will provide the user what number to press
     * to get to each of the different options
     */
    public static void menu() {
        System.out.println("The Names Menu\n"//output
                + "*********************************\n"//output
                + "1. Add Names\n"//output
                + "2. Print out all names\n"//output
                + "3. Search for name in the list\n"//output
                + "4. Print out all names sorted\n"//output
                + "5. How many names are in the list?\n"//output
                + "6. Exit\n"//output
                + "*********************************");//output
    }

    /**
     * namesArray - asks the users how many names they would like to enter by
     * providing an int, validates the int, then prompts for each name for the
     * provided int amount
     *
     * @return
     */
    
    public static void namesArray(ArrayList<String> names) {
        Scanner keyboard = new Scanner(System.in);
        int namesAdd;
        System.out.println("How many names would you like to enter? Only enter an integer."); //Output
        namesAdd = inputValidation(); //validates that the user only an int
        for (int i = 0; i < namesAdd; i++) { //Loops as many times as the users wants to add friends
            System.out.println("Enter the name of friend " + (i + 1)); //Output + adds 1 to each friend the user wants to add

            names.add(keyboard.nextLine());
        }
    }

    /**
     * displayNames - displays the names of friends that the user entered
     *
     * @param names
     */
    
    public static void displayNames(ArrayList<String> names) {
        System.out.println("Your friends are: "); //output
        for (int i = 0; i < names.size(); i++) { //loops until the last name is output
            System.out.println(names.get(i));
        }
    }

    /**
     * serachNames - asks the user what name they want to search for and output
     * if it's in the list or not
     *
     * @param search
     */
    
    public static void searchNames(ArrayList<String> search) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What name are you searching for?"); //output
        String searchName = keyboard.nextLine(); //takes in the users name they are searchign for
        if (search.contains(searchName)) { //if the usere entered search is in the list of names entered do this
            System.out.println(searchName + " is in the list");//output if the name the user is searching for is on the list
        } else { //else the usere entered search is in the list of names entered do this
            System.out.println(searchName + " is not in the list"); //output if the name the user is searching for is not on the list
        }
    }

    /**
     * inputValidation -
     *
     * @return
     */
    
    public static int inputValidation() {
        Scanner keyboard = new Scanner(System.in);

        int userAnswer = 0; //userAnswer starts at 0
        while (!keyboard.hasNextInt()) {
            System.out.println("Invalid. Please enter a number"); //output if the user enters a non-int number
            keyboard.nextLine(); //loops until the user enters a correct int
        }
        userAnswer = keyboard.nextInt(); //user enetered int
        return userAnswer; //returns userAnswer to main()
    }

}
