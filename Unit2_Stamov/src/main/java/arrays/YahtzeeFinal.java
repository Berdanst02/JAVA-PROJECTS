

package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class YahtzeeFinal {

    public static int topScore(int[] dice, int num) {
    int score = 0;
    for (int i = 0; i < dice.length; i++) {
      if (dice[i] == num) {
        score += num;
      }
    }
    return score;
  }

  ///////////////////
  public static int threesame(int[] dice) {
    int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0;
    int total = 0;
    for (int i = 0; i < dice.length; i++) {
      switch (dice[i]) {
        case 1 -> count1++;
        case 2 -> count2++;
        case 3 -> count3++;
        case 4 -> count4++;
        case 5 -> count5++;
        case 6 -> count6++;
      }
      i++;
    }
    if (count1 == 3 || count2 == 3 || count3 == 3 || count4 == 3 || count5 == 3 || count6 == 3) {
      for (int x = 0; x < dice.length; x++) {
        total += dice[x];
        x++;
      }
    }
    return total;
  }

  
   //Four of the same (Oliver)
   public static int fourLike(int[] rolls){
   int c1=0,c2 = 0,c3=0,c4=0,c5=0,c6=0;
    for(int i =0; i<rolls.length; i++){
    switch(rolls[i]){
    case 1 -> c1++;
    case 2 -> c2++;
    case 3 -> c3++;
    case 4 -> c4++;
    case 5 -> c5++;
    case 6 -> c6++;
    }
    if (c1 == 4||c2==4||c3== 4||c4== 4||c5== 4||c6== 4){
    int total = 0;
    for(int j = 0; j< rolls.length; j++){
    total+=rolls[j];
    }
    return total;
    }
    }
    return 0;
   }
    
    
    
 
   
    public static int chance(int[] dice){
    int Chance = 0;
    int L = dice.length;
    L = L - 1;
    for (int x = 0; x <= L; x++) {
    int N = dice[x];
    Chance = Chance + N;
    }
    return Chance;
    }
   
  ///////////////////////////////////
  public static int smallStraight(int[] dice) { // by simon
    boolean[] check = new boolean[6]; // creates a "checklist" of numbers 1-6
    int pass = 0; // a special counter that will help us later
    for (int x = 0; x < dice.length; x++) {
      check[dice[x] - 1] = true; // filling in "checklist" for numbers rolled
    } // if multiple of the same number is rolled, doesn't matter, it's "checked"
    for (int y = 0; y < check.length; y++) {
      if (check[y]) { // checks if boolean at pos. Y is true
        pass++; // adds to counter if true
      } else {
        pass = 0; // resets counter otherwise
      }
      if (pass >= 4) { // if there's ever a 4 in a row,
        return 30; // return as success,
      }
    }
    return 0; // otherwise, return as failure
  }

  // The class itself (James)
  static int lgStraight(int[] dice) {
    Arrays.sort(dice);
    int check = dice[0];
    for (int x = 0; x < dice.length; x++) {
      if (check == dice[x]) {
        check++;
      } else {
        return (0);
      }
    }
    return (40);
  }

  ////////////////////////////////
  static int fullHouse(int[] dice) { // (Evelyn)
    Arrays.sort(dice);

    if (dice[0] == dice[4]) {
      return 0;
    }
    if (dice[0] != dice[1] || dice[3] != dice[4]) {
      return 0;
    }
    if (dice[2] == dice[1] || dice[2] == dice[3]) {
      return 25;
    }
    return 0;
  }

  public static int yahtzee(int[] dice, int currentamountofYahtzees) {// Berdan

    Arrays.sort(dice);

    if (dice[0] == dice[1] && dice[0] == dice[2] && dice[0] == dice[3] &&
        dice[0] == dice[4] && currentamountofYahtzees == 0) {

      return 50;
    }

    else if (dice[0] == dice[1] && dice[0] == dice[2] && dice[0] == dice[3] &&
        dice[0] == dice[4] && currentamountofYahtzees > 0) {

      return 100;

    }

    else {

      return 0;
    }

  }

  
  
  public static void printscorecard(int[] scores){
 
         System.out.println("Aces[1] :"+scores[1]); 
         System.out.println("Twos[2] :"+scores[2]); 
         System.out.println("Threes[3] :"+scores[3]); 
         System.out.println("Fours[4] :"+scores[4]);
         System.out.println("Fives[5] :"+scores[5]); 
         System.out.println("Sixes[6] :"+scores[6]); 
         System.out.println("Bonus :"+scores[8]+"\n"); 
         System.out.println("Three of A Kind[10] :"+scores[10]);
         System.out.println("Four of a Kind[11] :"+scores[11]); 
         System.out.println("Full House[12] :"+scores[12]); 
         System.out.println("Small Straight[13] :"+scores[13]); 
         System.out.println("Large Straight[14] :"+scores[14]); 
         System.out.println("Yahtzee[15] :"+scores[15]); 
         System.out.println("Chance[16] :"+scores[16]); 



         
         
  }
  
 
  public static int bonus(int[] topScores){
  int bonusscore=0;
      for(int i=0;i<topScores.length;i++){
  
      bonusscore +=topScores[i];
  
  }
      
      if(bonusscore>=63) return 35;
      else return 0;
  
  }
  
  
  
  public static int[] roll(int[] dice, String reRoll) {
    Random r = new Random();
    
    String[] indexes = reRoll.split(" ",0);
    
    for(int i=0;i<indexes.length;i++){
      //the dice will roll at given indexes, which is at indexes[i] and will parse the given index in the String 
        dice[Integer.parseInt(indexes[i])] = r.nextInt(1,7); 
        
    }
    
    return dice;
  }

 
 
  //public static void check(int[] newNumbers) {

  //}

  public static void main(String[] args) {
    
  Scanner s = new Scanner(System.in);
  int[] dice = {0,0,0,0,0};
  String reRoll = "0 1 2 3 4";
  String userInput;
  int scoreSpot;
  int tempScoreTally=0;
  int amountofYahtzees=0;
  int tempYahtzee=0;
  int[] topScores = new int[6];
   
  boolean[] openScores = new boolean[20];
  
  for(int i=0;i<openScores.length; i++){
      openScores[i] = true;
  }
  int[] scores = new int[20];
  
  System.out.println("Welcome to Yahtzee");
  for(int turn=1; turn < 14; turn++){
      reRoll = "0 1 2 3 4";
      for(int rollNum=1;rollNum<4;rollNum++){
      
      dice = roll(dice, reRoll);
      System.out.println(Arrays.toString(dice));
      if(rollNum < 3){
      
      System.out.print("Roll again y or no?");
      userInput = s.nextLine();
      if(userInput.equals("n")){
          break;
          
      }
      System.out.println("Enter indexes of dice to roll again");
      reRoll = s.nextLine();
      
      }
      
      }
      
      System.out.printf("Final dice Values: %s\n", Arrays.toString(dice));
      
      printscorecard(scores);
      
      
      while(true){
      System.out.print("Where would you like to place your score");
      scoreSpot = s.nextInt();
      s.nextLine();
      if(openScores[scoreSpot]==true){
      openScores[scoreSpot]=false;
      break;
      }
      else{
      System.out.println("Space has been taken try again");
      }
      
      
      }
      switch(scoreSpot){
      //*****
          case 1: scores[1] += topScore(dice,1);
          case 2: scores[2] += topScore(dice,2);
          case 3: scores[3] += topScore(dice,3);
          case 4: scores[4] += topScore(dice,4);
          case 5: scores[5] += topScore(dice,5);
          case 6: scores[6] += topScore(dice,6);
          case 7: scores[10] += threesame(dice);
          case 8: scores[11] += fourLike(dice);
          case 9: scores[12] += fullHouse(dice);
          case 10: scores[13] += smallStraight(dice);
          case 11: scores[14] += lgStraight(dice);
          case 12: scores[15] += yahtzee(dice, amountofYahtzees);
          //yahtzee bonus, if amount of yahtzees is greater than 0 it will return 100 for every yahtzee is gets after the first yathzee
          tempYahtzee = yahtzee(dice, amountofYahtzees);
          if(tempYahtzee >=50){
          amountofYahtzees++;
          }
          
          case 13: scores[16] += chance(dice);
      }
      
      
      for(int i=0;i<topScores.length;i++){
      topScores[i] = scores[i];
      }
      
      
      
      
      
      tempScoreTally=0;
      for(int i=1;i<topScores.length;i++){
      tempScoreTally+= scores[i];
      }
      
      scores[7] = tempScoreTally;
      scores[8] = bonus(topScores);
      scores[9] = scores[7] + scores[8];
      
      
      tempScoreTally=0;
      for(int i=10;i<18;i++){
          tempScoreTally+= scores[i];
      
      }
      scores[18]= tempScoreTally;
      scores[19]= scores[9]+ scores[18];
      
      
      
      
      
  }
  
  System.out.println("Game Over, Your total score is "+(scores[19]));
  System.out.println("Your total scores for the top was "+scores[9]+" With additional "+scores[8]+" bonus points");
  System.out.println("Your total for bottom scores was "+scores[18]);

}
  
}