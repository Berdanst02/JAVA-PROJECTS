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
public class diceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numberofRolls1[];
        int numberofRolls2[];
        //int DiceNumbers[] = {1,2,3,4,5,6};
        //int amountofNumbersdice[] = {1,2,3,4,5,6};
        
        
        System.out.println("Type in how many times you are going to roll");
        int quantityofRolls = s.nextInt();
        int[] rollTally = new int[7];
       
        numberofRolls1 = new int[quantityofRolls];
        numberofRolls2 = new int[quantityofRolls];
        
        
        for(int i=0;i<quantityofRolls;i++){
         rollTally[numberofRolls1[i]]++;
        }
        for(int i=0;i<quantityofRolls;i++){
         rollTally[numberofRolls2[i]]++;
        }
        
        
        for(int i=1;i<rollTally.length;i++){
        //continue
        }
        
        
        
        for(int i=0; i<quantityofRolls;i++){
        
        
        numberofRolls1[i] = r.nextInt(1,7);
        numberofRolls2[i] = r.nextInt(1,7);
        System.out.println("Roll "+(i+1)+":"+(numberofRolls1[i]+numberofRolls2[i]));
        
        
        
        }
        //counter which ticks everytime i roll
        //create a variable that stores how many times a certain value has been rolled
    }
    
}
