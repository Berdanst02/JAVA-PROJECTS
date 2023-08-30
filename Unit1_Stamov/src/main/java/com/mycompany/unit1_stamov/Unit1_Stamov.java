/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unit1_stamov;

/**
 *
 * @author berd1810
 */
public class Unit1_Stamov {
    static String name = "Berdan";
    static String trainer = "Ted";
    public static void main(String[] args) {
        
        Conversation();
        exitProgram();
        
        
    }
    
    
     public static void wait(int seconds)
{
    try
    {
      seconds = seconds* 1000;
        Thread.sleep(seconds);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }

}
     
     
     
     public static void Conversation(){
     
     System.out.println("Hello! Welcome to your first day orientation "+ name);
     wait(2);
     System.out.println("Thank you for having me! "+trainer);
     wait(2);
     System.out.println("For your first day you will be working in the stock department to get familiar with the items");
     wait(2);
     System.out.println("Ok thank you!");
     wait(2);
     System.out.println("First I will show you how to clock in and where the daily schedule is");
     wait(2);
     System.out.println("When will I get my uniform?");
     wait(2);
     System.out.println("You will get it in 2 days, and The cost of the uniform will be deduceted from your paycheck");
     wait(2);
     System.out.println("Ok can I start my training now?");
     wait(2);
     System.out.println("Yes! Let's go ahead, the first thing you will be doing is learning how to organize your workspace.");
     wait(2);
     System.out.println("Ok!");
     wait(2);
     
     
     }
     
     public static void exitProgram(){
    
        System.out.println("And they continued the training, Program will exit in 5");
        wait(1);
        System.out.println("4");
        wait(1);
        System.out.println("3");
        wait(1);
        System.out.println("2");
        wait(1);
        System.out.println("1");
        wait(1);
        System.out.println("0");
        System.exit(0);
    }
}
