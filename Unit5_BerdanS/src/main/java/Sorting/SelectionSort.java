/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class SelectionSort {


    public static void main(String[] args) {
        int size = 20;
		int [] nums = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {  //populate a list with random values
            nums[i] = r.nextInt(99);
        }
       // int[] nums = {8,4,2,6,9,1};

        System.out.printf("Unsorted Result: \n");
        for (int n : nums) {
            System.out.printf("%d ", n);
        }

        nums = SelectionSort(nums);

        System.out.printf("\nSorted Result: \n");
        for (int n : nums) {
            System.out.printf("%d ", n);
        }
    }

    public static int[] SelectionSort(int[] myList) {

        int n = myList.length;
        int minValueIndex = 0;
        int tempValue;
        for(int i=0;i<n;i++){
        
        for(int j=i;j<myList.length;j++){
            
            if(myList[j]<myList[minValueIndex]) minValueIndex = j; 
        
        }
        
        tempValue= myList[i];
        myList[i] = myList[minValueIndex];
        myList[minValueIndex] = tempValue;
        minValueIndex=i+1;
        
        
       
        }
        return myList;
        
    }
}
