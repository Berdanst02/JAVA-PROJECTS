/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author berd1810
 */
public class doubleArray {

   
    
    public static double[] nearestNickel(double prices[]){
    
        double roundedValues[];
        
        roundedValues = new double[prices.length];
        
        for(int i=0; i<prices.length;i++){
        
            
           roundedValues[i] = Math.round(prices[i] * 20) / 20d;
        }
        
        
        
        
        
       return roundedValues; 
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        double[] prices = {23.12,10.56,7.99};
        
        
        double[] rounded = nearestNickel(prices);
        
        
        for(int i=0;i<prices.length;i++){
        System.out.printf("Original Price: %.2f,\t rounded price: %.2f\n",prices[i],rounded[i]);
        
        }
        
        
    }
    
}
