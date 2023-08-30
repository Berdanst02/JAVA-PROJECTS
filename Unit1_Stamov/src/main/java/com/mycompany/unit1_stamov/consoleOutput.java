/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;
import java.util.Random;

/**
 *
 * @author berd1810
 */
public class consoleOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String Name = "Berdan";
        String lastName= "Stamov";
        Random rand = new Random();
        
        System.out.printf("%s %s",Name,lastName);
        
        System.out.printf("\r %s ",Name);
        System.out.printf("\r %s ",lastName);
        
        String friend1 = "Joe";
        String friend2 = "Jonathan";
        String friend3 = "Joseph";
   
        int years = rand.nextInt(100);
        
        years = rand.nextInt(100);
        System.out.printf("\r%s will be my friend for %d years. \n", friend1, years);
        years = rand.nextInt(100);
        System.out.printf("%s will be my friend for %d years. \n", friend2, years);
        years = rand.nextInt(100);        
        System.out.printf("%s will be my friend for %d years. \n", friend3, years);
        
        
        
        
        
        
    }
    
}
