/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package npcarena;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author berd1810
 */
public class Arena {

    Random r = new Random();

    private Npc[] npcs = new Npc[4];

    public Arena() {

        npcs[0] = new Npc();
        npcs[1] = new Npc();
        npcs[2] = new Npc();
        npcs[3] = new Npc();

        npcs[0].setName("Bon");
        npcs[1].setName("Bob");
        npcs[2].setName("Tom");
        npcs[3].setName("Ron");

  
    }

    
    public Npc Battle(Npc npc1, Npc npc2){
        int coinflip = r.nextInt(0, 2);
       
        System.out.println(coinflip);
        Npc BattleWinner;
        if (coinflip == 0) {
            while (true) {
                
                npc1.takeDmg(npc2.getAttack());
                
                
                if (npc1.getHealthpoints() <= 0) {
                    BattleWinner = npc2;
                    break;
                    
                    //if npc1's hp is less than or equal to 0 then npc 2 automically wins
                }
                npc2.takeDmg(npc1.getAttack());

                if (npc2.getHealthpoints() <= 0) {
                    BattleWinner = npc1;
                    break;
                    //if npc2's hp is less than or equal to 0 then npc 1 automically wins
                }
               

            }
        } else {
            //same thing as above but npc 2 goes first 
            while (true) {
                npc2.takeDmg(npc1.getAttack());

                if (npc2.getHealthpoints() <= 0) {
                    BattleWinner = npc1;
                    break;
                }
                npc1.takeDmg(npc2.getAttack());
                if (npc1.getHealthpoints() <= 0) {
                    BattleWinner = npc2;
                    break;
                }
               

            }
        }
        //reset hp so that the npc is ready to go for the next fight
        BattleWinner.resetHealthPoints();

        return BattleWinner;
        
    
    
    }
    
    
    //battle 1  
    
    public Npc battle1() {
        System.out.println("Battle 1 \n ===========================");
        npcs[0].printStats();
        npcs[1].printStats();
        Npc Battle1Winner;
        
        //winner of battle 1 will equal to the Battle method which returns the winner of two npcs who are taken as parameters
        Battle1Winner = Battle(npcs[0], npcs[1]);
        System.out.println("The winner of the first battle is "+Battle1Winner.getName());
        
        
        
return Battle1Winner;
    }

    //battle2
    public Npc battle2() {
        System.out.println("Battle 2 \n ===========================");
        npcs[2].printStats();
        npcs[3].printStats();
        
        Npc Battle2Winner;
        //winner of battle 2 will equal to the Battle method which returns the winner of two npcs who are taken as parameters
        Battle2Winner = Battle(npcs[2], npcs[3]);
        System.out.println("The winner of the second battle is "+Battle2Winner.getName());

return Battle2Winner;

    }
    
    
    public Npc FinalBattle(Npc Battle1Winner, Npc Battle2Winner) {

    
        
        Npc FinalBattleWinner;
        //winner of the final battle will equal to the Battle method which returns the winner of two npcs who are taken as parameters
        FinalBattleWinner = Battle(Battle1Winner, Battle2Winner);
        System.out.println("The winner of the final battle is "+FinalBattleWinner.getName());

    return FinalBattleWinner;
    }

}
