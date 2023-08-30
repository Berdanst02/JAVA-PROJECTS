/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sorting;



import java.util.ArrayList;
import java.util.Random;


public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Random r = new Random();
        
        for(int i = 0; i < 20; i++){  //populate a list with random values
            nums.add(r.nextInt(99));
        }
        
        System.out.printf("Unsorted Result: \n");
        for(Integer n : nums){
            System.out.printf("%d ", n);
        }
        
        nums = InsertSort(nums);
        
        System.out.printf("\nSorted Result: \n");
        for(Integer n : nums){
            System.out.printf("%d ", n);
        }
        
    }
    
    
     public static ArrayList<Integer> InsertSort(ArrayList<Integer>myList)
        {
            
            
             
        for (int i = 1; i < myList.size(); i++) {
            int key = myList.get(i);
            int j = i - 1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && myList.get(j) > key) {
                myList.set(j+1, myList.get(j));
               
                j = j - 1;
            }
            
            myList.set(j+1,key);
         
        }
            
            
            
            
            
            
            
            
//            int tempValue;
////              
//        for(int i=1;i<myList.size();i++){
//        
//            while(){}
//            if(myList.get(i)< myList.get(i-1)){
//                
//                  tempValue = myList.get(i-1);
//                  myList.set(i-1, myList.get(i));
//                  myList.set(i, tempValue);
//                
//            }
//            
//            
//            
//            
//            
//            
//        }



//        for(int i=1;i<myList.size();i++){
//                  
//                  
//                  for(int j=i;j>0;j--){
//                  
//                      if(myList.get(j)<myList.get(j-1)){
//                      
//                       tempValue = myList.get(j);
//                       myList.set(j, myList.get(j-1));
//                       myList.set(j-1, tempValue);
//                       
//                      
//                      }
//                      
//                  }
                  
                  
//                  j = i-1;
//                  while(i>0 && myList.get(j) > myList.get(i)){
//                  
//                      tempValue = myList.get(i);
//                      myList.set(i, myList.get(j));
//                      myList.set(j,tempValue);
//                      
//                      
//                  
//                  }
                  
                  
                  
//              }
            
            return myList;
            
            
			
        }
}
