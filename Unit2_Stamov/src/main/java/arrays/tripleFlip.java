/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author darkb
 */
public class tripleFlip {

    
    
    public static int[] tripleFlip(int numFlips){
        Random r = new Random();
        
        
        int count;
        int flip1,flip2,flip3;
        int[] headcount = new int[numFlips];
        
        for(int i=0;i<numFlips;i++){
            count=0;
            //1 is heads and 2 is tails
            flip1 = r.nextInt(1,3);
            flip2 = r.nextInt(1,3);
            flip3 = r.nextInt(1,3);
        
            if(flip1 ==1)count++;
            if(flip2 ==1)count++;
            if(flip3 ==1)count++;
            headcount[i] = count;
         
        }
        
        
        
        
        
        
        
        
        return headcount;
        
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        
        int[] headcount= tripleFlip(18);
        
        for(int i=0;i<headcount.length;i++){
        
            System.out.printf("Flip %d: %d Heads\n",i+1,headcount[i]);
            
            
        }
        
        
        
        
    }
    
}
