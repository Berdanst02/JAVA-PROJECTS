/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;

import java.util.Random;

/**
 *
 * @author berd1810
 */
public class OverloadingEx {

    /**
     * @param args the command line arguments
     */
   
    
    public static int MyRandomInt(){
   
    
        
        return MyRandomInt(1,100);  
    }
    
    
    
    
    
    
     public static int MyRandomInt(int num2){
    int randomNumber;
    Random rand = new Random();
        
    randomNumber =rand.nextInt(1,(num2+1));
         
     return randomNumber;   
    }
    
     
    public static int MyRandomInt(int num1,int num2){
    int randomNumber;
    Random rand = new Random();
        
    randomNumber =rand.nextInt(num1,num2+1);
         
    return randomNumber;   
    }
   
    //ex2 methods
    //d = v*t
    public static int DistanceTravelled(int timeTravelled, int speed){
    
        int distance = speed * timeTravelled;
        
        return distance;
    }
    /*public static int DistanceTravelled(String timeTravelled, String speed){
    
          int IntTime = Integer.parseInt(timeTravelled);  
          int IntSpeed = Integer.parseInt(speed);  
          
          
          //continue
            
    }
    */
    
    
    public static void main(String[] args) {
       
    int random1 = MyRandomInt();  
    int random2 = MyRandomInt(7);
    int random3 = MyRandomInt(6,129);        
        
    System.out.println(random1);
    System.out.println(random2);
     System.out.println(random3);
        
    }
    
}
