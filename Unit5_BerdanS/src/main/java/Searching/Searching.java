/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Searching;

import java.util.Arrays;

/**
 *
 * @author berd1810
 */
public class Searching {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        
        int[] n = {5, 3, 7, 9, 2, 1};
        
        IntList temp = new IntList(n);
        
//        System.out.println(temp.SequentialSearch(9));
//        System.out.println(temp.SequentialSearch(9, false));

        
//        temp.SequentialSwap(5);
//        System.out.println(temp.getArray().toString());

        String[] w = {"this", "is", "a", "bunch", "of","of", "words"};
        
 StringList temp2 = new StringList(w);
        
 System.out.println(temp2.SequentialSearch("a"));
        
System.out.println(Arrays.toString(temp2.DuplicateWords()));
    }
}
