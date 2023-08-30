/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
         Scanner s = new Scanner(System.in);
         
         double grades[];
         
         int sizeofGrades =5;
         grades = new double[5];
         
         for(int i=0;i<sizeofGrades;i++){
         System.out.printf("Enter grade for subject #%d:",i+1);
         grades[i]= s.nextDouble();
         
         
         
         
         }
         
         for(int i=0;i<sizeofGrades;i++){
             
         System.out.printf("Grade for subject #%d: %.2f\n",i+1,grades[i]);
         
         }
         
         double average=0;
         double totalgrade =0;
         for(int i=0;i<sizeofGrades;i++){
         
        
         
         totalgrade +=grades[i];
         
         average = totalgrade/5;
         
         }
         System.out.println(totalgrade);
         
         System.out.println("The average is "+average);
         
         
         
         
        
        
        
        
        
        
    }
    
}
