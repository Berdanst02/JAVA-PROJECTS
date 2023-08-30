/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sorting;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author berd1810
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {  //populate a list with random values
            nums.add(r.nextInt(99));
        }

        System.out.printf("Unsorted Result: \n");
        for (Integer n : nums) {
            System.out.printf("%d ", n);
        }

        nums = BubbleSort(nums);

        System.out.printf("\nSorted Result: \n");
        for (Integer n : nums) {
            System.out.printf("%d ", n);
        }
        System.out.println();
    }

    public static ArrayList<Integer> BubbleSort(ArrayList<Integer> a) {
       int n = a.size();
       for(int i=0;i<n;i++){ 
           
           for(int j=0;j<n-i-1;j++){
           
               if (a.get(j) > a.get(j+1)) swap(a, j, j+1);
               
          
           }
           
          
        
       }
        
        return a;
    }

//supporting swap method.

    public static void swap(ArrayList<Integer> a, int x, int y) {
        int temp = a.get(x);
        a.set(x, a.get(y));
        a.set(y, temp);
    }
}

