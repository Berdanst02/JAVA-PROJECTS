/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessinggame;

import java.util.Random;

public class GuessMachine {

    Random r = new Random();
    private int randomNumber;
    private int userGuess;
    private int numGuesses;

    public GuessMachine() {

        randomNumber = r.nextInt(1, 101);
        userGuess = 0;
        numGuesses = 0;

    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public int numGuesses() {
        return numGuesses;
    }

    public boolean setGuess(int guess) {

        try {

            if (guess > 100 || guess < 0) {

                numGuesses++;
                return false;
            } else {
                userGuess = guess;
                numGuesses++;

                return true;
            }
        } catch (Exception e) {
            numGuesses++;
            return false;
        }

    }

    public String giveHint() {

        if (userGuess > randomNumber) {
            return "Too High, Guess Lower.";
        } else if (userGuess < randomNumber) {
            return "Too Low, Guess Higher or an invalid guess";
        } 
        
        else {
            return "You got it";
        }

    }

    public int getnumGuesses() {

        return numGuesses;
    }
    public void increasenumGuesses(){
    
    numGuesses++;
    }

}
