/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class rollYahtzee {

    
    
    
     public static int[] roll(){
    Random r = new Random();
    int[] dice = new int[5];
    String userInput;
    for(int i=0;i<dice.length;i++){
        
        dice[i] = r.nextInt(1,7);
    }
    //reroll
    return dice;
    
  }
     
    public static int[] reroll(int currentamountofRolls,int amountofdiceLeft){
     Random r = new Random();
     int[] dice = new int[amountofdiceLeft];
    
    for(int i=0;i<dice.length;i++){
    dice[i]=r.nextInt(1,7);
    }
    
    return dice;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


    
    int[] dice = roll();
    
    for(int i=0;i<dice.length;i++){
    System.out.println("Index: "+i+" - "+ dice[i]);
    }
    
    System.out.println("Which die do you want to keep? Enter Index Number");
    String userInput = s.nextLine();


    String[] keeps = userInput.split("",0);
    
    for(int i=0;i<keeps.length;i++){
    
      System.out.printf("Keep %d\n", Integer.parseInt(keeps[i]));
      
      
    }
    
    
    
    
    
    }
    
}
