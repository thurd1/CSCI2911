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
 * Graduate
 * -----------------------
 * -fieldOfStudy : String 
 * -numberOfCredits : int
 * -----------------------
 * +Graduate(field : String, credits : int)
 * +Graduate()
 * +setFieldOfStudy(field : String) : void
 * +setNumberOfCredits(credits : int) : void
 * +getFieldOfStudy() : String
 * +getNumberOfCredits() : int
 * +toString() : String
 */
package csci2916;

public class Graduate extends Student {
    
    private String field;
    private int credits;
    /**
     * Graduate - String field, itn credits
     * @param field
     * @param credits 
     */
    public Graduate(String field, int credits){
        this.field = field;
        this.credits = credits;
    }
    /**
     * Graduate - sets field and credits to nothing
     */
    public Graduate(){
        this.field = "";
        this.credits = 0;
    }
    /**
     * setField - sets field
     * @param field 
     */
    public void setField(String field){
        this.field = field;
    }
    /**
     * setCredits - sets credits
     * @param credits 
     */
    public void setCredits(int credits){
        this.credits = credits;
    }
    /**
     * getField - gets field
     * @return 
     */
    public String getField(){
        return field;
    }
    /**
     * getCredits - gets credits
     * @return 
     */
    public int getCredits(){
        return credits;
    }
    /**
     * toString - converts field and credits to a String
     * @return 
     */
    public String toString(){
        return "Field: "+field+". Credits: "+credits+".";
}
}
