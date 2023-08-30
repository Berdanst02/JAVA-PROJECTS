/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class contactlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        long phoneBook[];
        int sizeofPhoneBook;
        long phoneNum;
        
        
        
        //System.out.println("How many numbers will you enter? ");
       sizeofPhoneBook = 100;
        
        phoneBook = new long[100];
        
        for (int i=0;i< sizeofPhoneBook;i++){
        System.out.println("Enter a phone number: ");
        phoneNum = s.nextLong();
        phoneBook[i] = phoneNum;
        
        if(phoneNum==-1){
        break;
        }
        phoneBook[i]=phoneNum;
        sizeofPhoneBook++;
        
        
        
        
        
    
    
    }
        
        System.out.println("\n Contact List: ");
        for(int i=0;i<sizeofPhoneBook; i++){
        System.out.printf("%d, %d\n", i+1,phoneBook[i]);
        }
        
        
        
                
        
        
        
    }
    
}
