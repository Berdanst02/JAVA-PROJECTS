/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lucky7package;

import java.util.Random;

/**
 *
 * @author berd1810
 */

public class Dice {
    
    Random r = new Random();
    private int number;
    
    
    public Dice(){
    
    number = 0;
    }
    
    public void roll(){
    
    number = r.nextInt(1,7);
    
    }
    
    public int getValue(){
    return number;
    }
    
    
    
    
    
    
    
}
