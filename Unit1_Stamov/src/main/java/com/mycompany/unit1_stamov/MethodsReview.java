/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class MethodsReview {

    
    public static void Countdown(int Number){
    
    for(int i=Number;i>=0;i--)System.out.println(i);
    
    
    
    
    }
    
 
    
   
    
    
    
    
    
    public static void main(String[] args) {
        
        
        //Countdown(10);
  
       
   int userNumber = ValidIntInput();    
   System.out.println("Your integer is "+userNumber);
        
        
        
    }
    
    
   public static int ValidIntInput(){
   System.out.println("Enter an integer and I will tell you if its valid");
   Scanner s = new Scanner(System.in);
      
   int integer=0;
   
   while(true){
       
       try {
         integer = s.nextInt();
          
          break;
           
       } catch (Exception e) {
       
           
           System.out.println("You did not enter a valid number, try again");
           
             s.nextLine();
           
          
           
       }
   
   
   }
   
    return integer;
   
   
   } 
    
}
