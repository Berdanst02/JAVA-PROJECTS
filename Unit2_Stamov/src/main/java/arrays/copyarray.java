/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author berd1810
 */
public class copyarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] pricesJanuary={1.29, 9.99, 22.50, 4.55, 7.35};
        double[] pricesFebruary= new double[pricesJanuary.length];
        
        
        
        
        // ***** important **
        System.arraycopy(pricesJanuary, 0, pricesFebruary, 0, pricesJanuary.length);
        
        
        
        
        
        pricesFebruary[1] = 10.99;
        System.out.println(pricesJanuary[1]);
        
        
        
        
    }
    
}
