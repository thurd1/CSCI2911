/* @author Trenton Hurd
 * @date 25 Februrary 2022
 * Assignment: HurdTrentonLab7
 * 
 * Algorithm:
 * 1. Write a program that validates regular expressions to validate input
 * 2. Valid input includes: first name, student ID,phone number, and birthdate
 * 3. First name should include only of letters
 * 4. Student ID should start with @ and only costist of 9 digits
 * 5. Phone number should be in a specific format (###)###-####
 * 6. Birthdate should enter in a specific format ##/##/####
 * 7. The program will ask the user to enter again if they enter an invalid entry
 * 8. Display everything
 */
package csci2916;

import java.util.*;

public class HurdTrentonLab7 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name, identification, phone, birthday;
        boolean valid1, valid2, valid3, valid4; //validates

        System.out.println("Enter your first name using only letters A-z with a minimum of 1 character and a max of 10 characters: "); //output 
        name = keyboard.nextLine(); //users input for name
        valid1 = validateName(name); //validates 

        System.out.println("Enter a valid sutdent ID. Your student ID should start with @and contain 9 digits 0-9"); //output 
        identification = keyboard.nextLine(); //users input for their student ID
        valid2 = validateStudentID(identification);//validates 

        System.out.println("Enter a valid phone number and include the ( ) and the - with the format (###)###-####"); //output 
        phone = keyboard.nextLine(); //users input for their phone number
        valid3 = validatePhoneNumber(phone);//validates 

        System.out.println("Enter a valid birthdate with the following format ##/##/####"); //output 
        birthday = keyboard.nextLine(); //users input for their birthdate
        valid4 = validateBirthdate(birthday);//validates 

        while (!valid1) {
            System.out.println("That name is invalid. Try again using only letters A-z with a minimum of 1 character and a max of 10 characters: ");//output
            name = keyboard.nextLine(); //the user trys again
            valid1 = validateName(name); //re-checks the validation
        }
        while (!valid2) {
            System.out.println("That student ID is invalid. Try again starting with @ and following with 9 digits between 0 and 9: ");//output
            identification = keyboard.nextLine(); //the user trys again
            valid2 = validateStudentID(identification);//re-checks the validation
        }
        while (!valid3) {
            System.out.println("That phone number is invalid. Please follow this format using only numbers 0-9: (###)###-####: ");//output
            phone = keyboard.nextLine(); //the user trys again
            valid3 = validatePhoneNumber(phone);//re-checks the validation
        }
        while (!valid4) {
            System.out.println("That birthdate is invalid. Please use the format ##/##/#### using only numbers 0-9: "); //output
            birthday = keyboard.nextLine(); //the user trys again
            valid4 = validateBirthdate(birthday);//re-checks the validation
        }
        System.out.println("Name: "+name + " Student ID: " + identification + " Phone Number: " + phone + " Birthdate: " + birthday);
    }

    /**
     * validateName - validate students name
     *
     * @param name - the user entered name is checked returned to main
     * @return
     */
    public static boolean validateName(String name) {
        return name.matches("[A-Za-z]{1,10}"); //name must be bewteen A-Z, a-z, and must be a min of 1 character and max of 10
    }

    /**
     * validateStudentID - validates student ID
     *
     * @param student - the student entered ID is returned to main
     * @return
     */
    public static boolean validateStudentID(String student) {
        return student.matches("\\@[0-9]{9}"); //student must start with an @ and be only digits between 0-9 and be 9 digits in length
    }

    /**
     * validatePhoneNumber - validates user phone number
     *
     * @param phone - the phone number entered is returned to main
     * @return
     */
    public static boolean validatePhoneNumber(String phone) {
        return phone.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}");  //area code is 3 letters between 0-9 surrounded by ( ), then 3 more digits 0-9 with a - after, then 4 more digits 0-9
        //phone number must be in the correct phone number format (###)###-#### including the ( ) 's and the -
    }

    /**
     * validateBirthdate - validates user birthday
     *
     * @param birthday - the birthday entered is returned to main
     * @return
     */
    public static boolean validateBirthdate(String birthday) {
        return birthday.matches("[0-12]{1,2}\\/[0-9]{2}\\/[0-9]{4}"); //month is bettwen 01-12, day is 2 digits beween 0-9, year is 4 digits between 0-9 
//birthday must be in the correct format ##/##/#### including the /'s
    }
}
