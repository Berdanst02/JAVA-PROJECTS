/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sorting;

/**
 *
 * @author berd1810
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] nums = {5,12,3,11,2,7,20,10,8,4,9,15,57,98,24,87,3,12,1};
        
        for(int n: nums){
            System.out.printf("%d ",n);
        }
        System.out.println();
        
        quick(nums,0,nums.length-1);
        
        
         for(int n: nums){
            System.out.printf("%d ",n);
        }
        System.out.println();
        
    }
    
    
    
    public static void quick(int[] a, int left, int right){
    
        if(left >= right){ //base case
        return;
        }
        
        int i = left;
        int j= right;
        int pivotValue = a[(left+right)/2];
        
        
        while(i<j){
        
           while(a[i] < pivotValue){ //find indicies to swap
           i++;
           }
            
           while(a[j]> pivotValue){
           j--;
           }
         
           if(i<=j){ //swap if necessary
           int temp = a[i];
           a[i]= a[j];
           a[j] = temp;
           i++;
           j--;
           
           }
           
           
           
           
           
        }
        
        quick(a,left,j);
        quick(a,i,right);
        
    }
    
    
}
