/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author darkb
 */
public class BounceDecay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        bounceDecay(0, 2000000000, 0.001, 0.1);
    }
    
    
    public static int bounceDecay(int bounceNumber, double startHeight, double decayFactor, double finalThreshold){
           double currentHeight = startHeight;
        
           
           currentHeight = currentHeight - decayFactor * currentHeight;
           System.out.println("The current height: "+currentHeight + "\t Bounce:"+bounceNumber);
           bounceNumber++;
           
        if(currentHeight<=finalThreshold) return 0;
        
        else{
            return bounceDecay(bounceNumber, currentHeight,decayFactor,finalThreshold);
        }
        
        
        
    }
    
}
