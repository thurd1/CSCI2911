/*
 * @Author Trenton Hurd
 * @Date 8 April 2022
 *  Algorithm:
 * 1. Ask the user for the graduate students name.
 * 2. Ask the user for the graduates students phone number;
 * 3. Asks the user for the graduates students e-mail;
 * 4. Validate students name, phone number, and e-mail
 */
package csci2916;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String student, phoneNumber, email, field, credits;
        boolean valid1, valid2, valid3, valid4, valid5;
        

        System.out.println("What is the name of the graduate student?");
        student = keyboard.nextLine();
        valid3 = validateName(student);

        System.out.println("What is their phone number? (###)###-####");
        phoneNumber = keyboard.nextLine();
        valid1 = validatePhoneNumber(phoneNumber);

        System.out.println("What is their E-mail address?");
        email = keyboard.nextLine();
        valid2 = validateElectronicMail(email);
        
        System.out.println("What is their field of study?");
        field = keyboard.nextLine();
        
        System.out.println("How many credits hours are required for this degree? (Enter Number)");
        credits = keyboard.nextLine();
        valid4 = validateCredits(credits);
        
        
        System.out.println("****Student Record****");
        System.out.println("Name of graduate student: "+student);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("E-mail address: "+email);
        System.out.println("Major: "+field);
        System.out.println("Required Major Course Credits "+credits);
    }

    public static boolean validatePhoneNumber(String phone) {
        return phone.matches("\\([0-9]{3}\\)[0-9]{3}-[0-9]{4}");  //area code is 3 letters between 0-9 surrounded by ( ), then 3 more digits 0-9 with a - after, then 4 more digits 0-9
        //phone number must be in the correct phone number format (###)###-#### including the ( ) 's and the -
    }

    public static boolean validateElectronicMail(String email) {
        return email.matches("[A-Za-z]{3,20}[1-9]{0,1}\\@my.hpu.edu");
    }

    public static boolean validateName(String name) {
        return name.matches("[A-Za-z]{1,10}"); //name must be bewteen A-Z, a-z, and must be a min of 1 character and max of 10
    }
    public static boolean validateCredits(String credits){
        return credits.matches("[0-9]{3}");
    }
}
