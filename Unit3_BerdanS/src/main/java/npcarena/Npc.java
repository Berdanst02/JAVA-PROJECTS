/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package npcarena;

import java.util.Random;
import java.util.Timer;

/**
 *
 * @author berd1810
 */
public class Npc {

    Timer timer = new Timer();
    Random r = new Random();
    private double Healthpoints;
    private String name;
    private double defencePer;
    private double Manapoints;
    private double maxMana;
    private double maxAttack;
    private double maxHealthPoints;
    private double manaRegenRate;
    private double manaLossRate;

    public Npc() {

        maxHealthPoints = r.nextDouble(80,100);
        //have "no name" if the npc's name is not set
        name = "No Name";
        defencePer = r.nextDouble(40,70);
        maxAttack = r.nextDouble(100,200);
    }
    
   
     


     public double getHealthpoints() {
		return Healthpoints;
	}
	public void resetHealthPoints() {
		Healthpoints = maxHealthPoints;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDefencePer() {
		return defencePer;
	}
	public void setDefencePer(double defencePer) {
		this.defencePer = defencePer;
	}
	public double getMaxAttack() {
		return maxAttack;
	}
	public void setMaxAttack(double maxAttack) {
		this.maxAttack = maxAttack;
	}
        public void printStats(){
        
        System.out.printf("%s's stats: \n",this.name);
        System.out.printf("MAX HP: %.2f \t",maxHealthPoints);
            
       
        System.out.printf("Attack : %.2f\t",maxAttack);
        System.out.printf("DEFENCE : %.2f \n",defencePer);
        
        
        }
  
//public void regenMana() {
//        Manapoints += manaRegenRate;
//        if(Manapoints >= maxMana) Manapoints = maxMana;
//    }
//public void loseMana(){
//    Manapoints -= manaLossRate;
//    if(Manapoints<=0) Manapoints = 0;
//    }  
    public Boolean checkAlive() {
//if hp is less than 0 it will return false meaning its not alive
        if (this.Healthpoints <= 0) {
            return false;
        } else {
            return true;
        }

    }

    public double getAttack() {

        double atkVal;
        //random attack value between 1 and the npc's max attack damage
            atkVal = r.nextDouble(1, maxAttack + 1);
            
        return atkVal;

    }

    public void takeDmg(double dmg) {
        // the formula for defense : https://www.reddit.com/r/gamedesign/comments/pxhx8d/what_are_common_damage_formulas_for_games_that/

        this.Healthpoints -= (dmg * 1.5) - this.defencePer;
    }

}
