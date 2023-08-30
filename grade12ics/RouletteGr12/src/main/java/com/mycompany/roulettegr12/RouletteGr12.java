package com.mycompany.roulettegr12;

import java.util.Random;

public class RouletteGr12 {

    public static boolean redspacetrue;  
    public static String greenNumber;
    public static void main(String[] args) {
       
        
            
    Random rand = new Random();
    int selection = rand.nextInt(-1,37);
    
    
    String OddorEven = "";
    if(selection % 2 == 0){
    
    OddorEven = "Even"; 
   
    }
    
    else{
    
    OddorEven = "Odd";
    
    }
    
    String numberVersus = "";
    if(selection <=18 && selection >=1) numberVersus="1 to 18";
    else numberVersus="19 to 36";
    
    redspacetrue = false;
    
    int[] redSpaces = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34,36};
    
    for (int i = 0; i < redSpaces.length; i++) {
            
            if(selection == redSpaces[i]){
                redspacetrue=true;
                break;
                
            }
        
        }
    
    
    boolean greenTrue = false;
    
    if(selection==0){
        greenTrue=true;
        
        int zeroZero =rand.nextInt(2)+1;
        System.out.println(zeroZero);
        if(zeroZero == 1)greenNumber = "0";
        else greenNumber="00";
        
    
    }
    
    
    
    
    if(redspacetrue ==true){
    System.out.println("The spin resulted in "+selection);
    System.out.println("Pay "+selection);
    System.out.println("Pay Red");
    System.out.println("Pay " + OddorEven);
    System.out.println("Pay "+ numberVersus);
    
    }
    
    else if(redspacetrue==false && greenTrue == true){
    System.out.println("The spin resulted in "+greenNumber);
    System.out.println("Pay "+greenNumber);
    }
    else{
    System.out.println("The spin resulted in "+selection);
    System.out.println("Pay "+selection);
    System.out.println("Pay Black");
    System.out.println("Pay " + OddorEven);
    System.out.println("Pay "+ numberVersus);
    
    
    }
    
    
    
        
    }
}
