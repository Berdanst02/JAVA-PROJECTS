/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author darkb
 */
public class shiftArray {

    public static int[] shift(int[] originalarr,int shiftValue ){
        shiftValue= shiftValue% originalarr.length;
        int arr[] = new int[originalarr.length];
        
        for(int i=0;i<arr.length;i++){
    
        if(shiftValue < 0 )shiftValue = arr.length + shiftValue;
        
       arr[(i+shiftValue)%arr.length]= originalarr[i];
        
    }
        
    return arr;
        
        
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int array[] = {1,2,3,4,5};
        
        
        
        
        
        
    }
    
}
