/**
 * @author Trenton Hurd
 * @date 01/14/2022
 * Assignment HurdTrentonA1.java
 * 
 * Algorithm 
 * 1. Asks the user for his/her name
 * 2. Asks the user for his/her height in feet and inches
 * 3. Converts the height into inches
 * 4 Asks the user for his/her weight in pounds.
 * 5. Calculates the BMI (see formula above).
 * 6. Outputs in a nicely formatted way the person’s name, their BMI and indicates what category the person
falls in (see the BMI Categories table (Underweight, Healthy, Overweight, Obese)
*/
package javaapplication6;
    import java.util.*; // imports every java.util
    public class HurdTrentonA1_extra {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
     
            String userName;
            double userKilos, userMeters;
            int count = 0;
           while(count<=4)
           {
            System.out.println("This is a Body Mass Index Calculator Program");
            System.out.println("You will be asked for your name, weight in pounds, and height in feet and inches");
            System.out.println("*****************************************************************");
            
            System.out.println("What is your name?");
            userName = keyboard.next();
            
               System.out.println("What is your weight in kilograms?");
               userKilos = keyboard.nextDouble();
               
               System.out.println("What is your height in meters?");
               userMeters = keyboard.nextDouble();
               
               double bodyMaxIndexKilos = userKilos/userMeters^2;
               
               System.out.println("Hi "+userName+", your BMI is "+bodyMaxIndexKilos); 

            if(bodyMaxIndexKilos<=18)
            {
                        System.out.println("You are underweight!");
            }
            if(bodyMaxIndexKilos>=19&&bodyMaxIndexKilos<=24)
            {
                        System.out.println("You are healthy!");
            }
            if(bodyMaxIndexKilos>=25&&bodyMaxIndexKilos<=29)
            {
                        System.out.println("You are overweight :( ");
            }
            if(bodyMaxIndexKilos>=30)
            {
                        System.out.println("You are obese :(( ");
            }
         count++;
           }         
        }
    }
