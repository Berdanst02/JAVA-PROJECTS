/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class challanges1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] flightTimes = {{0,45,90,70,60},{45,0,70,60,70},{100,75,0,195,130},{80,60,180,0,85},{60,75,115,80,0}};
        String[] cities = {"Istanbul","Ankara","Erzurum","Adana","Izmir"};
        
        
        for(int i=0;i<cities.length;i++){
        System.out.print(cities[i]);
        System.out.print(" ");
        }
        System.out.println();
     
        for(int row=0;row<flightTimes.length;row++){
        System.out.printf("%3s: ",cities[row]);
        for(int column=0;column < flightTimes[row].length;column++){
        
            System.out.printf("%3d",flightTimes[row][column]);
            
        
        }
        System.out.println();
        
        }
        
    
     boolean[][] seats = new boolean[24][29];
     
     for(int row=0;row<seats.length;row++){
     for(int col=0;col< seats[row].length;col++){
     
         seats[row][col]= false;
     
     }
     
     
     }
     
     
     while(true){
     
     for(int row=0;row<seats.length;row++){
     System.out.println();
         for(int col=0;col< seats[row].length;col++){
     
         if(seats[row][col]==false)System.out.print("f ");
         
         else System.out.print("t ");
             
             
         
     
     }
     
     
     }
     
     System.out.println("\nWhich row do you want to pick a seat?");
     int userRow = s.nextInt();
     
     
     
     
     System.out.println("Which col do you want to pick a seat?");
     int userCol = s.nextInt();
     
     if(userRow ==-1 || userCol ==-1)System.exit(0);
     
     
     seats[userRow][userCol]=true;   
        
        
        
        
     } 
        
        
    }
    
    
    
    
}
