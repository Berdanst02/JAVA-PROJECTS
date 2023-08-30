/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
/**
 *
 * @author berd1810
 */
public class Repetition_ex1 {
    public static int userNumber;
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.println("Enter number");
      int userInput = s.nextInt();
      int answer=0;
      for (int i = 0; i < 13; i++) {
      
          answer = userInput * i;
          
          
          System.out.printf("%d x %d = %d \n",userInput,i,answer);
          
        }
        
        
        
        
        
        
        
        
        //ex1
        long currentNumber=0 ;
        for (int i = 0; i < 123457; i++) {
            
            currentNumber+=i;
            
            
        }
        System.out.println("The total is "+currentNumber);
        
        
        
        //100m dash
        /*
        
        int totalDistance=0;
        
        int runner1,runner2,runner3,runner4;
        
        while(totalDistance<100) {
            
            int distanceCovered1 = rand.nextInt(5,16);
            int distanceCovered2 = rand.nextInt(5,16);
            int distanceCovered3 = rand.nextInt(5,16);
            int distanceCovered4 = rand.nextInt(5,16);
            
            
            
            totalDistance+=distanceCovered;
            
            
            
            
            System.out.println("total distance covered right now is "+totalDistance);
            
        }
        
        
        
     */  
        
        
        //3x+1
       
               
       System.out.println("Enter Number for Collatz algorithm");
       userNumber = s.nextInt();

    
       
       if(userNumber==1){
        
           System.out.println("Collatz Conjecture: 1");
           userNumber = (userNumber*3)+1;
          System.out.println("Collatz Conjecture: "+userNumber);
       }
       
       while(userNumber != 1){
       
       
       if(userNumber%2==0)userNumber=userNumber/2;
        
       else{
       
       userNumber = (userNumber*3)+1;
       
       }
       
       System.out.println("Collatz Conjecture:"+userNumber);
       
       
       
       
       
       }
        
    }
    
    
    
    
    
    
}
