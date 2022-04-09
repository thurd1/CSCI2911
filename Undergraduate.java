/*
 * @author Trenton Hurd
 * @date 8 April 2022
 *------------------------
 * Student
 * -----------------------
 *            ^ 
 *            |
 *            |
 * ----------------------
 * Undergraduate
 * -----------------------
 * -major : String 
 * -numberOfGenEdCredits : int
 * -numberOfMajorCredits : int
 * -----------------------
 * +Undergraduate(major : String, numGen : int, numMaj : int)
 * +Undergraduate()
 * +setMajor(major : String) : void
 * +setnumberOfGenEdCredits(numGen : int) : void
 * +setnumberOfMajorCredits(numMaj : int) : void
 * +getMajor() : String
 * +getnumberOfGenEdCredits() : int
 * +getnumberOfMajorCredits() : int
 * +toString() : String
 */
package csci2916;

public class Undergraduate extends Student{
    
    private String major;
    private int numberOfGenEdCredits;
    private int numberOfMajorCredits;
    /**
     * Undergraduate - String major, int numberOfGenEdCredits, int numberOfMajorCredits
     * @param major
     * @param numberOfGenEdCredits
     * @param numberOfMajorCredits 
     */
    public Undergraduate(String major, int numberOfGenEdCredits, int numberOfMajorCredits){
        this.major = major;
        this.numberOfGenEdCredits = numberOfGenEdCredits;
        this.numberOfMajorCredits = numberOfMajorCredits;
    }
    /**
     * Undergraduate - sets major, numberOfGenEdCredits, and numberOfMajorCredsits to nothing
     */
    public Undergraduate(){
        this.major = "";
        this.numberOfGenEdCredits = 0;
        this.numberOfMajorCredits = 0;
    }
    /**
     * setMajor - sets major
     * @param major 
     */
    public void setMajor(String major){
        this.major = major;
    }
    /**
     * setNumGen - sets numberOfGenEdCredits
     * @param numberOfGenEdCredits 
     */
    public void setNumGen(int numberOfGenEdCredits){
        this.numberOfGenEdCredits = numberOfGenEdCredits;
    }
    /**
     * setNumMaj - sets numberOfMajorCredits
     * @param numberOfMajorCredits 
     */
    public void setNumMaj(int numberOfMajorCredits){
        this.numberOfMajorCredits = numberOfMajorCredits;
    }
    /**
     * getMajor - gets major
     * @return 
     */
    public String getMajor(){
        return major;
    }
    /**
     * getNumGen - gets the number of general education credits
     * @return 
     */
    public int getNumGen(){
        return numberOfGenEdCredits;
    }
    /**
     * getNumMak - gets the number of major credits
     * @return 
     */
    public int getNumMaj(){
        return numberOfMajorCredits;
    }
    /**
     * toString - converts major, numerOfGenEdCredits, numberOfMajorCredits to a String
     * @return 
     */
    public String toString(){
        return super.toString() + "Major: "+major+". Number of General Education Credits: "+numberOfGenEdCredits+". Number of Major Credits: "+numberOfMajorCredits+".";
    }
    
}
