/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;
import java.util.Scanner;
/**
 *
 * @author berd1810
 */
public class chessBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    
        String userInput=s.nextLine();
        
        int rowValue = userInput.charAt(1);
        int colValue = userInput.charAt(0);
        System.out.printf("row value is: %d \r column value is %d",rowValue,colValue);
        
        
        if(rowValue%2==0){
            if(colValue%2==0){
            System.out.println("The square is black");
            
            }
            else{
            System.out.println("The square is white");
            }
            
            
            
            
        
        }
        
        else{
        
        if(colValue%2==0){
            System.out.println("The square is black");
            
            }
            else{
            System.out.println("The square is white");
            }
        
        
        }
        
     
        
    }
    
}
