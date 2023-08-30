/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Searching;

//import java.util.ArrayList;

public class BinarySearch {

    public static void main(String[] args) {
		
		int[] n = {12, 34, 47, 62, 75, 87, 90};
              
                
		
		//populate your array with sorted values
        
		int searchValue = 47; // change this value!
		
		System.out.println(BinSearch(n, searchValue));  // output should be the index of the search value
        
    }
    
    public static int BinSearch(int[] nums,int searchValue)
    {
        //indexes
        int bottom = 0;
        int middle;
        
        int top = nums.length-1;
        
        while(true){
        middle = (bottom+top)/2;
        
        if(searchValue == nums[middle]) return middle;
        
        else if(searchValue > nums[middle]) bottom = middle+1;
        
        else if(top==bottom && middle!= searchValue) return -1;
        
        else top = middle-1;
        
        
            
            
        
        }
        
        
        
        
        
        
        
        
//        while(true){
//        
//            if(searchValue < nums[middle]){
//                top = middle-1;
//                bottom=0;
//                middle= middle/2;
//                
//            }
//            
//            
//            else if(searchValue> nums[middle]){
//                top= nums.length-1;
//                bottom = middle+1;
//                middle = (bottom+top)/2;
//                
//                
//            
//            }
//            
//            if(bottom == middle && middle == top && top==bottom)break;
//        
//        
//        }
//        
//        if(nums[middle]==searchValue) return middle;
//        else return -1;
        
        
        
        
        
        
        
        
        
    }
    
}
