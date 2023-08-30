/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author berd1810
 */
public class Patients {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int patientNumber;
    
    
    
    public Patients(String fn, String ln, int pn, String dob)
        {
    firstName = fn;
    lastName = ln;
    patientNumber = pn;
    dateOfBirth = dob;
        } 
    
    
    
    public Patients(int pn){
    
    patientNumber = pn;
    firstName = "John";
    lastName="Doe";
    dateOfBirth="Jan 1 1990";
    
    }
    
    
    public String getFirstName(){
    return firstName;
    }
    
    public String getLastName(){
    return lastName;
    }
    
    public String getDateofBirth(){
    return dateOfBirth;
    }
    
    public int getPatientNumber(){
    return patientNumber;
    }
    
    public void setFirstName(String newFirstName)
       {
           this.firstName = newFirstName;
       }
    
    
    public void setLastName(String newLastName)
       {
           this.lastName = newLastName;
       }
    
    public void setBirthday(String newBirthday)
       {
           this.dateOfBirth = newBirthday;
       }
    
    
    public String toString(){
    String temp = String.format("%s DOB: %s PN: %s", this.firstName, this.dateOfBirth,this.patientNumber);
    
    
    
    return temp;
    }
    
    
    

}
