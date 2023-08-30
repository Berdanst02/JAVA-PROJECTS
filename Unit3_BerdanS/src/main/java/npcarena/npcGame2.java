/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package npcarena;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class npcGame2 {

    /**
     * @param args the command line arguments
     */
    //temp variables to ask the user for input
     
   
    
    
    
    public static void main(String[] args) {
      
       Arena npcArena = new Arena();
       Npc winner;
       winner = npcArena.FinalBattle(npcArena.battle1(), npcArena.battle2());
       
       System.out.println("The Champion is "+winner.getName());
     
      
     
       
       
       
       
    
       
       
       
       
        
        
    }

}
