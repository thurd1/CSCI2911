/*
 * @author Trenton Hurd
 * @date 8 April 2022

 * Student
 * -----------------------
 * -name : String 
 * -phone : String
 * -email : String
 *------------------------
 * +Student(name : String, p : String, e : String)
 * +Student()
 * +setName(name : String) : void
 * +setPhone(phone : String) : void
 * +setEmail(Email : String) : void
 * +getName() : String
 * +getPhone() : String
 * +getEmail() : String
 * +toString() : String
 */
package csci2916;

public class Student{
 /**
  * 
  */
    private String name;
    private String phone;
    private String email;
/**
 *  Student - String name, String phone, String email
 * @param name
 * @param phone
 * @param email 
 */
    public Student(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
/**
 * Student - sets name, phone, and email to nothing.
 */
    public Student() {
        this.name = "";
        this.phone = "";
        this.email = "";
    }

    /**
     * setName - sets name
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
/**
 * setPhone - sets phone
 * @param phone 
 */
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
 * setEmail - sets email
 * @param email 
 */
    public void setEmail(String email) {
        this.email = email;
    }
/**
 * getName - gets name
 * @return 
 */
    public String getName() {
        return name;
    }
/**
 * getPhone - gets phone
 * @return 
 */
    public String getPhone() {
        return phone;
    }
/**
 * getEmail - gets email
 * @return 
 */
    public String getEmail() {
        return email;
    }
/**
 * toString - converts name, phone, and email to a String
 * @return 
 */
    public String toString() {
        return "Name: " + name + ". Phone number: " + phone + ". E-mail: " + email + ".";
    }
}
