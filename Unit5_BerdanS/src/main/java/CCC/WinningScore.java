/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CCC;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class WinningScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int[] apples = new int[3];
        System.out.println("Enter first 3 lines for apples");
        
        for(int i=apples.length-1;i>=0;i--){
            
           apples[i]= s.nextInt();
           apples[i] = apples[i] * i+1; 
        }
        
        int appletotal = 0;
        
        for(int i=0;i<apples.length;i++){
        appletotal += apples[i];
        }
        
        System.out.println("Enter first 3 lines for bananas");
        int[] bananas = new int[3];
         for(int i=bananas.length-1;i>=0;i--){
            
           bananas[i]= s.nextInt();
           bananas[i] = bananas[i] * i+1; 
        }
         
          int bananatotal = 0;
        
        for(int i=0;i<bananas.length;i++){
        bananatotal += bananas[i];
        }
         
         
       
         if(bananatotal > appletotal){
         
         System.out.println("B");
         }
         else if(appletotal > bananatotal){
         
         System.out.println("A");
         }
         
         else{
             System.out.println("T");
         }
        
    }
    
}
