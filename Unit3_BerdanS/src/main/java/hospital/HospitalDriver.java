
package hospital;

import java.util.Scanner;

public class HospitalDriver {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Patients patientZero; //decleration
        patientZero = new Patients("Will","Robinson",1,"June 15 2003"); //instantation
        
     
        
       System.out.printf("First Name: %s\t Last Name: %s",patientZero.getFirstName(),patientZero.getLastName());
//        
//        
//        Patients patientOne; //decleration
//        
//        
//        System.out.println("\nenter first name");                
//        String patientOneName = s.next();
//        System.out.println("enter last name");    
//        String patientOnelast = s.next();
//         System.out.println("enter birth date");
//        String patientOnedob=s.next();
//        int patientOneNumber=1;
//        
//        patientOne = new Patients(patientOneName,patientOnelast,patientOneNumber,patientOnedob);
//        System.out.printf("First Name: %s\t Last Name: %s",patientOne.firstName,patientOne.lastName);
//        
        Patients patientUnknown;
        patientUnknown = new Patients(2);
        
        System.err.println("\n");
        System.out.println(patientZero.toString());


    }
    
}
