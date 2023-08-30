/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

import java.util.Scanner;




public class ArrayProblem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //pseudocode 
        
//        - create a grid from numbers 1 to 49, a 7 by 7 grid
//        - create a pos variable that will store the middle number of the 3x3 square grid
//        - create algorithm that will sum up the numbers in the given 3x3 grid.
//        - create array that will store the position of middle 3x3 squares.
        
          
          int[][] Grid = new int[7][7];
          
          int i=0;
          for(int row=0;row<Grid.length;row++){
             
            for(int col=0; col < Grid[row].length;col++){
                    i++; 
                    Grid[row][col] = i;
            
            }
            
            
        }

        for(int row=0;row<Grid.length;row++){
        System.out.println();
            for(int col=0; col < Grid[row].length;col++){
            
                    System.out.printf("%3d",Grid[row][col]);
            
            }
            
            
        }
        
        
        int sum=0;
             
          for(int row=1;row<Grid.length-1;row++){
             
            for(int col=1; col < Grid[row].length-1;col++){
                   
                    sum+= Grid[row][col];
                    sum+=Grid[row+1][col];
                    sum+=Grid[row-1][col];
                    
                    sum+=Grid[row][col+1];
                    sum+=Grid[row][col-1];
                    
                    sum+=Grid[row-1][col+1];
                    sum+=Grid[row-1][col-1];
                    
                    sum+=Grid[row+1][col+1];
                    sum+=Grid[row+1][col-1];
                
            
            if(sum==279){
            System.out.println("The sum of the 3 by 3 square is "+sum+", the number at the centre is "+Grid[row][col]); 
             s.next();
             sum=0;
            }
            
            else{
             System.out.println("Number is not 279, type anything to contiue, and it will move onto next set of 3 by 3 grid"); 
             s.next();
             sum=0;
            
            }
            
            }
            
            
            
            
            
            
        }
          
          

        
        
        
        
    }
    
}