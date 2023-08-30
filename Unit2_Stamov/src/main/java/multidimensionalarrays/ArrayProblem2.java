/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class ArrayProblem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random r = new Random();
       Scanner s = new Scanner(System.in); 
       int[][] mask = new int[5][5];
        
        int[][] gridNumbers = new int[5][5];
        
        for(int row=0;row<gridNumbers.length;row++){
        
            for(int col=0; col < gridNumbers[row].length;col++){
            
                gridNumbers[row][col] = r.nextInt(1,5);
            
            }
            
            
        }
        gridNumbers[0][0] = 8;
        
        
        // game
       
        
         for(int row=0;row<mask.length;row++){
            System.out.println();
            for(int col=0; col < mask[row].length;col++){
            
                mask[row][col]=0;
            
            }
            
            
        }
        
        
        
        
        
        System.out.println("\nType anything to start the game");
        s.next();
        
        
        
        
        
        int posx=0;
        int posy=0;
        mask[0][0]=8;
        while(true){
           
         for(int row=0;row<mask.length;row++){
            System.out.println();
            for(int col=0; col < mask[row].length;col++){
            
                System.out.print(mask[row][col]+" ");
            
            }
            
            
        }
         
         System.out.println("type in w to go up, s to go down, a to go left, and d to go right");
         
         String userInput= s.next();
         
         if(userInput=="w")posy--;
         if(userInput=="s")posy++;
         if(userInput=="a")posx--;
         if(userInput=="d")posx++;
         
         mask[posy][posx]=gridNumbers[posy][posx]; 
         
         System.out.println("x: "+posx+" posy:"+posy);
             
         
            
       
        
         

//write position, current positon
         


   
         
        
         
         
         
            
            
            
        
        }
        
        
        
        
        
        
        
        
       
       
       
       
       
    }
    
}
