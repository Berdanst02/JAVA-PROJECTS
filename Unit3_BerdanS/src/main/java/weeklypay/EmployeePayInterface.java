/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weeklypay;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class EmployeePayInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        
        
        
        Employee emp = new Employee();
        
        
        
        System.out.println("Enter Name:");
        String name = s.next();
        
        if(emp.setName(name)==false){
        System.exit(0);
        }
        else {
        emp.setName(name);
        }
        
        int type;
        while(true){
            System.out.println("Type (1 for  FT or 2 for PT):");
            type = s.nextInt();
            if(emp.setType(type)==false){
            continue;
            }
            else if(emp.setType(type)==true){
            
            emp.setType(type);
            break;
            }
            
            
        
        }
        
        double hourlyRate;
        
        while(true){
            System.out.println("Enter Hourly Rate 6.75-30.50:");
            hourlyRate = s.nextDouble();
            
            if(emp.setRate(hourlyRate)==false)continue;
            
            else if(emp.setRate(hourlyRate)==true){
            emp.setRate(hourlyRate);
            break;
            }
            
            
        }
        
        int hours;
        while(true){
            System.out.println("Enter Hours Worked 1-60:");
            hours = s.nextInt();
            
            if(emp.setHours(hours)==false)continue;
            
            else if(emp.setHours(hours)==true){
                emp.setHours(hours);
                break;
                    
            }
            
            
            
        
        }
        
            System.out.println("The weekly pay for "+emp.getName()+" is "+emp.getPay());
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
