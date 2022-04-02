/*
 * @Trenton Hurd
 * @Date April 1 2022
 * Algorithm
 * Classes and methods from the unified modeling language diagram that we did on paper
 *--------------------
 * Motorcycles
 * --------------------
 * -make : String
 * -year : int 
 * -speed() : int
 * --------------------
 * +Motorcycles (m : String, y : int)
 * +Motorcycles() 
 * +setMake(m : String) : void
 * +setYear(y : int) : void
 * +getMake() : String
 * +getYear() : int
 * +getSpeed() : int
 * +speedAccelerate() : int
 * +speedBreak() : int 
 * +toString() : String => speed x3 break x2 
 */
package csci2916;

public class Motorcycles {

    private String make;
    private int year;
    private int speed = 0;

    /**
     * Motorcycles - 
     * @param m
     * @param y
     */
    public Motorcycles(String m, int y) {
        make = m;
        year = y;
        speed = 0;
    }

    /**
     * Motorcycles - Constructor that takes in all the attributes
     */
    public Motorcycles() {
        make = ""; //makes starts as blank
        year = 0; //year starts at 0
        speed = 0; //speed starts at 0
    }

    /**
     * setMake - sets the make
     *
     * @param m
     */
    public void setMake(String m) {
        make = m;
    }

    /**
     * setYear - sets the year
     *
     * @param y
     */
    public void setYear(int y) {
        year = y;
    }

    /**
     * getMake - gets the make
     * 
     */
    public String getMake() {
        return make;
        
    }

    /**
     * getYear - gets the year
     * @param y
     * @return
     */
    public int getYear(){
        return year;
    }
    /**
     * getSpeed - returns the speed of the motorcycle
     * @param s
     * @return 
     */
    public int getSpeed(){
        return speed;
    }
    /**
     *  speedAccelerate - returns the speed of the motorcycle accelerating
     * @param speAcc
     * @return 
     */
    public int speedAccelerate() {
        return speed + 5;
    } 
    /**
     * speedBreak - returns the speed of the motorcycle decelerating 
     * @param speBre
     * @return 
     */
public int speedBreak(){
    return speed - 5;
}

    /**
     * toString - returns the toString
     * @param toStr
     * @return
     */
@Override
    public String toString(){
    return "Make:" +make+ " Year: " +year+" Speed:"+speed;
}
}
