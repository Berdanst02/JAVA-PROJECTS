/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.unit1_stamov;

import java.util.Scanner;
import java.lang.Math; // Needed to use Math.round()

/**
 *
 * @author berd1810
 */
public class consoleInput_ex1 {

    /**
     * @param args the command line arguments
     */
    public static int x, y, z;
    public static double mark1, mark2, mark3, mark4;
    public static boolean valid;

    public static void wait(int seconds) {
        try {
            seconds = seconds * 1000;
            Thread.sleep(seconds);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

    }

    public static void checkintegerinput(String inputNumber) {

        
        while(true){
        try {
            Integer.parseInt(inputNumber);
            System.out.println(inputNumber + " is a valid integer");
            valid = true;
        } catch (NumberFormatException e) {
            System.out.println(inputNumber + " is not a valid integer, try again");
            valid = false;
        }
        if (valid ==true){
         break;
        } 
          
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        if (s.hasNextInt()) {
            x = s.nextInt();
            String stringx=String.valueOf(x);
            checkintegerinput(stringx);
        } else {
            System.out.println("Not a valid integer...");
        }
        System.out.println("Enter second number:");
        if (s.hasNextInt()) {
            y = s.nextInt();
            String stringy=String.valueOf(y);
            checkintegerinput(stringy);

        } else {
            System.out.println("Not a valid integer...");
        }
        System.out.println("Enter third number:");
        if (s.hasNextInt()) {
            z = s.nextInt();
            String stringz=String.valueOf(z);
            checkintegerinput(stringz);

        } else {
            System.out.println("Not a valid integer...");
        }

        int total = x + y + z;
        System.out.printf("Your total is %d\r", total);

        System.out.println("Enter first mark:");
        if (s.hasNextDouble()) {
            mark1 = s.nextDouble();

        } else {
            System.out.println("Not a valid integer...");
        }

        System.out.println("Enter second mark:");
        if (s.hasNextDouble()) {
            mark2 = s.nextDouble();

        } else {
            System.out.println("Not a valid integer...");
        }

        System.out.println("Enter third mark:");
        if (s.hasNextDouble()) {
            mark3 = s.nextDouble();

        } else {
            System.out.println("Not a valid integer...");
        }

        System.out.println("Enter fourth mark:");
        if (s.hasNextDouble()) {
            mark4 = s.nextDouble();

        } else {
            System.out.println("Not a valid integer...");
        }

        //not reading properly
        double avg = (mark1 + mark2 + mark3 + mark4) / 4;
        double roundedAvg = (double) Math.round(avg * 100) / 100;

        System.out.println("Your average is " + roundedAvg);

        double radius;
        double surfaceArea;
        double volume;

        System.out.println("Enter the radius to calculate volume and surface area of the sphere");
        radius = s.nextDouble();

        volume = (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

        wait(2);
        double roundedVolume = (double) Math.round(volume * 10) / 10;
        double roundedSurfaceArea = (double) Math.round(surfaceArea * 10) / 10;

        System.out.println("The Volume is " + roundedVolume + ", and the Surface area is " + roundedSurfaceArea);

    }

}
