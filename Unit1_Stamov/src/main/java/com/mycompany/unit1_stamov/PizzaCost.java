/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov; 
/**
 *
 * @author berd1810
 */
import java.util.Scanner;
public class PizzaCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);  
      
      
      System.out.println("What is the price of the pizza?:");
      
      double pizzaCost = s.nextDouble();
      
      System.out.println("How many people are splitting it?");
      
      int people = s.nextInt();
      
        
      double perpersonCost = pizzaCost/people;   
        
      System.out.println("The cost per person is "+perpersonCost);
      
      
      //ex2 - makeChange
      System.out.print("Enter money:");
      double money = s.nextDouble();
      money *= 100;
      double moneyLeft;
      
      
      int toonies,loonies, quarters, dimes, nickels, pennies;
      
      
      
      toonies = (int)money/200;
      loonies = (int)money % 200;
      
      
      moneyLeft = (money -(int)money*100);
      
      quarters = (int)moneyLeft/25;
      moneyLeft = moneyLeft % 25;
      
      //moneyLeft = moneyLeft - quarters*25;
      
      dimes = (int)moneyLeft/10;
      moneyLeft = moneyLeft % 10;
      
      //moneyLeft = moneyLeft - dimes*10;
      
      
      nickels = (int)moneyLeft/5;
      moneyLeft = moneyLeft % 5;
      
      
      //moneyLeft = moneyLeft - nickels*10;
      
      pennies = (int)moneyLeft;
      
      
      
      
      
      
      
      
      
      
      
      
    }
    
}
