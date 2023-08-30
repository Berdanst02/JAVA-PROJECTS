/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package arraylists;

/**
 *
 * @author berd1810
 */

import java.util.*;

public class arraylistbasics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> colours = new ArrayList<>( );
        colours.add("red");
        colours.add("green");
        colours.add("blue");
        
        
        
        
        
        
        //colours.get(1);
     String mixedColour = colours.get(0)+" " + colours.get(1);     //string concatenation
//
 colours.set(2, mixedColour);
 
 System.out.println(colours.get(2));
        
if(colours.contains("red"))
      System.out.println("red is in the list");
else
 System.out.println("red is not in the list.");




        
        
    }
    
}
