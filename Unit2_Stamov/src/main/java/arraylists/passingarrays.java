/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author berd1810
 */
public class passingarrays {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    
    
    public static ArrayList LevelConversion(ArrayList<Integer> percentMarks){
        
       ArrayList<Integer> gradeMarks = new ArrayList<>(); 
        
       
       for(int i=0;i<percentMarks.size();i++){
        
            if(percentMarks.get(i)>=85){
            
                gradeMarks.add(4);
            }
            else if(percentMarks.get(i)<85 && percentMarks.get(i)>=70){
            
                gradeMarks.add(3);
            }
            
            else if(percentMarks.get(i)<70 && percentMarks.get(i)>=50){
            
                gradeMarks.add(2);
            }
            
            else if(percentMarks.get(i)<50 && percentMarks.get(i)>=20){
            
                gradeMarks.add(1);
                
            }
            
            else if(percentMarks.get(i)<20 && percentMarks.get(i)>=0){
            
                gradeMarks.add(0);
            }
            
            
            
        }
        
        return gradeMarks;
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
       ArrayList<Integer> numbers = new ArrayList<>( ); 
        
       
       numbers.add(88);
        numbers.add(98);
        numbers.add(68);
        numbers.add(78);
        numbers.add(38);
        numbers.add(68);
        numbers.add(18);
        numbers.add(100);
        numbers.add(0);
        numbers.add(88);
        
        
        ArrayList<Integer> grades = LevelConversion(numbers);
        
        numbers.forEach(var ->{
            System.out.println(var);
        });
        
        System.out.println("====");
        grades.forEach(tempvar ->{
            System.out.println(tempvar);
        });
        
        
    }
    
}
