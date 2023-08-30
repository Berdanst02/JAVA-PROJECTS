/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Recursion;

/**
 *
 * @author berd1810
 */
public class Rocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        countdown(5);
    }
    
    public static void countdown(int c){
if(c != 0)  // base case
{
System.out.println(c);
countdown(c-1);        // recursive call
}
}
    
}
