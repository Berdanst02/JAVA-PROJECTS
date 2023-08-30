/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lucky7package;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class lucky7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int highestValue = 0;
        int highestValueRoll = 0;
        int amountofrolls = 0;
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        System.out.println("How many dollars do you have?:");
        int userMoney = s.nextInt();

        while (userMoney >= 0) {

            dice1.roll();
            dice2.roll();
            amountofrolls++;

            if (dice1.getValue() + dice2.getValue() == 7) {
                userMoney += 4;
            } else {
                userMoney--;
            }

            if (userMoney >= highestValue) {

                highestValue = userMoney;
                highestValueRoll = amountofrolls;

            }

        }
        System.out.println("You are broke after "+amountofrolls+" rolls");
        
        System.out.println("You should have quit after "+highestValueRoll+" rolls, when you had $"+highestValue);
        
        
        

    }

}
