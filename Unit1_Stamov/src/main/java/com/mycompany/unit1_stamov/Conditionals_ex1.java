/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author berd1810
 */
public class Conditionals_ex1 {

    /**
      @param args the command line arguments
   */
   
    public static boolean redspacetrue;  
    public static String greenNumber;
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    /*egrered
    System.out.println("Enter integer and see if its even or odd");
    int value = s.nextInt();
    
    if(value%2==0){
    System.out.println("the number is even");
    
    
    }
    else{
    System.out.println("the number is odd");
    }
    
    
    System.out.println("Enter your percentage for the grade");
    
    double perGrade = s.nextDouble();
    
    
    if(perGrade>=80 && perGrade <=100){
        
        System.out.println("your grade is A");
    
    }
    
    else if(perGrade>=70 && perGrade <80){
        
        System.out.println("your grade is B");
    
    }
    
        
    else if(perGrade>=60 && perGrade <70){
        
        System.out.println("your grade is C");
    
    }

    else if(perGrade>=50 && perGrade <60){
        
        System.out.println("your grade is D");
    
    }
    
    else if(perGrade>=0 && perGrade <50){
        
        System.out.println("your grade is F");
    
    }
    
    
    else{
        System.out.println("You did not enter a valid grade");
    
    }
    
    */
    //roulette     
            
    Random rand = new Random();
    int selection = rand.nextInt(-1,37);
    
    
    String OddorEven = "";
    if(selection % 2 == 0){
    
    OddorEven = "Even"; 
   
    }
    
    else{
    
    OddorEven = "Odd";
    
    }
    
    String numberVersus = "";
    if(selection <=18 && selection >=1) numberVersus="1 to 18";
    else numberVersus="19 to 36";
    
    redspacetrue = false;
    
    int[] redSpaces = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34,36};
    
    for (int i = 0; i < redSpaces.length; i++) {
            
            if(selection == redSpaces[i]){
                redspacetrue=true;
                break;
                
            }
        
        }
    
    
    boolean greenTrue = false;
    
    if(selection==-1){
        greenTrue=true;
        
        greenNumber="00";
        
    
    }
    
    
    
    
    if(redspacetrue ==true){
    System.out.println("The spin resulted in "+selection);
    System.out.println("Pay "+selection);
    System.out.println("Pay Red");
    System.out.println("Pay " + OddorEven);
    System.out.println("Pay "+ numberVersus);
    
    }
    
    else if(redspacetrue==false && greenTrue == true){
    System.out.println("The spin resulted in "+greenNumber);
    System.out.println("Pay "+greenNumber);
    }
    else{
    System.out.println("The spin resulted in "+selection);
    System.out.println("Pay "+selection);
    System.out.println("Pay Black");
    System.out.println("Pay " + OddorEven);
    System.out.println("Pay "+ numberVersus);
    
    
    }
    
    
    
        
    }

  
    
        
    }
    

