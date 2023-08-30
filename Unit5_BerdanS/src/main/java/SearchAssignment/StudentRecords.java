/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SearchAssignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class StudentRecords {

    public static void main(String[] args) {
        String name, address;
        int id;
        ArrayList<ISSStudent> iss = new ArrayList<ISSStudent>();

        try {

            Scanner s = new Scanner(new File("studata.txt"));
            while (s.hasNext()) {
                name = s.nextLine();
                address = s.nextLine();
                id = Integer.parseInt(s.nextLine());
                iss.add(new ISSStudent(name, address, id));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        long binsearchTimeStart = System.nanoTime();
        System.out.println(BinSearch(iss, 880255336));
        long binsearchTimeEnd = System.nanoTime();

        long seqsearchTimeStart = System.nanoTime();
        System.out.println(SequentialSearch(880255336, iss));
        long seqsearchTimeEnd = System.nanoTime();

        System.out.println("It took bin search " + (binsearchTimeEnd - binsearchTimeStart) + " nanoseconds to execute");
        System.out.println("It took sequential search " + (seqsearchTimeEnd - seqsearchTimeStart) + " nanoseconds to execute");
        //sequential is faster 
    }

    public static int BinSearch(ArrayList<ISSStudent> iss, int targetID) {
        int bottom = 0;
        int middle;

        int top = iss.size() - 1;

        while (bottom <= top) {
            middle = (bottom + top) / 2;

            if (iss.get(middle).getID() < targetID) {
                bottom = middle + 1;
            } else if (iss.get(middle).getID() > targetID) {
                top = middle - 1;
            } else {
                return middle;
            }

            //int currentMiddleNum = iss.get(middle);
//        if(iss.get(middle).getID() == targetID) return middle;
//        
//        else if(targetID > iss.get(middle).getID()) bottom = middle+1;
//        
//        else if(top ==-1 && bottom==0 && iss.get(bottom).getID()!= targetID){ 
//            return -1;
//            
//        }
//     
//        
//        else top = middle-1;
//        System.out.println(top);
//        System.out.println(bottom);
        }
        return -1;

    }

    public static int SequentialSearch(int targetNum, ArrayList<ISSStudent> iss) {

        for (int i = 0; i < iss.size(); i++) {

            if (iss.get(i).getID() == targetNum) {
                return i;
            }

        }

        return -1;
    }

}
