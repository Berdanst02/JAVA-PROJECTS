/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

/**
 *
 * @author berd1810
 */
public class AssignmentArrayProblem1 {

    /**
     * @param args the command line arguments
     */
    
    public static int maximumValue(int[][] arr){
    
        int maxvalue=0;
        
        for(int row=0;row<arr.length;row++){
        
            for(int col=0; col < arr[row].length;col++){
            
                  if(arr[row][col]>maxvalue){
                  
                  maxvalue = arr[row][col];
                  }
                
            
            }
            
            
        }
        
        
        return maxvalue;
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        
        
        int arr[][] = {{1,5,6,8},{7,9,65},{8,6,4}};
        
        int max = maximumValue(arr);
        
        System.out.println(max);
        
        
        
    }
    
}
