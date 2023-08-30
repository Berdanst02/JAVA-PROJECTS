/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Searching;

import java.util.ArrayList;

/**
 *
 * @author berd1810
 */
public class StringList {
    
    String[] words;
    
    
    public StringList(String[] w){
    
        words = new String[w.length];
        System.arraycopy(w, 0, words, 0, words.length);
    
    
    
    
    }
    
    
    public int SequentialSearch(String targetWord){
    String temp;
         for (int i = 0; i < words.length; i++) {
            
            if(words[i].equals(targetWord)){
            return i;
            }
            
            
        }
    
    return -1;
    
    
    
    }
    
    public String[] DuplicateWords(){
    ArrayList<String> tempArr = new ArrayList<String>();
   
    
    for(int i=0;i<words.length;i++){
    
        tempArr.add(words[i]);
    
    }
            
        for(int i=0;i<tempArr.size();i++){
        
            for(int j= i+1;j<tempArr.size();j++){
                
                if(tempArr.get(i).equals(tempArr.get(j))){
                
                    tempArr.remove(i);
                }
            }
            
            
        
        }
        
        String[] toReturn = new String[tempArr.size()];
                
              toReturn= tempArr.toArray(toReturn);
    
        return toReturn;
    
    }
    
    public String[] arghVowels(){
   String[] tempArr = new String[words.length];
    for(int i=0;i<words.length;i++){
     
        tempArr[i]= words[i];
    }
    
        
        
        for(int i=0;i<words.length;i++){
    
        
     String tempString = tempArr[i];
        
       // for(int j=0;j<tempString.length();j++){
      
       // if(tempString.charAt(i)=='a'|| tempString.charAt(i)=='e'||tempString.charAt(i)=='i'||tempString.charAt(i)=='o'||tempString.charAt(i)=='u'){
            
            tempString = tempString.replaceAll("a", "argh");
            tempString = tempString.replaceAll("e", "argh");
            tempString = tempString.replaceAll("i", "argh");
            tempString = tempString.replaceAll("o", "argh");
            tempString = tempString.replaceAll("u", "argh");
       // }
        
    
        //}
        tempArr[i] = tempString;
    
    }

    return tempArr;
    }


}