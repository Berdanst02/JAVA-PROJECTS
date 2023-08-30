/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

/**
 *
 * @author berd1810
 */
public class IntList {
    
    int[] nums;
    
    public IntList(int[] n){
    
        nums = new int[n.length];

        System.arraycopy(n, 0, nums, 0, nums.length);
        
        
    
    
    
    }
    public int SequentialSearch(int targetNum, boolean direction){
    
    
        if(direction) return SequentialSearch(targetNum);
        
        for (int i = nums.length-1; i>=0; i--) {
            
            if(nums[i]==targetNum){
            return i;
            }
            
            
        }
        return -1;
    
    }
    
    public int SequentialSearch(int targetNum){
    
        
        for (int i = 0; i < nums.length; i++) {
            
            if(nums[i]==targetNum){
            return i;
            }
            
            
        }
    
    return -1;
    }
    
//    public void SequentialSwap(int targetNum){
//    int tempNum;
//
//    for (int i = 0; i < nums.length; i++) {
//            
//            if(nums[i]==targetNum){
//                
//                nums[i+1]=nums[i];
//                
//                
//            }
//            
//            
//        }
//        
//    
//    
//    }
    
    public int [] getArray(){
    return nums;
    }
    
    
    
}
