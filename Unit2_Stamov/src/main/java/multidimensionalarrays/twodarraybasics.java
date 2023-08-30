/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multidimensionalarrays;

import java.util.Scanner;

/**
 *
 * @author berd1810
 */
public class twodarraybasics {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
//             int [][] x = new int[2][3];  // declare an array and state size (2 x 3)
//
//        for (int row = 0; row < 2; row++){        // two rows: i = 0,1
//            for (int column = 0; column < 3; column++){    // three columns: j = 0,1,2
//                System.out.printf("Enter value for row %d and column %d: ", row, column);
//                x[row][column] = s.nextInt();
//                s.nextLine();
//            }
//        }
//        //output
//        for (int row = 0; row < 2; row++){        // two rows: i = 0,1
//            System.out.print("\n");
//            for (int column = 0; column < 3; column++){    // three columns: j = 0,1,2
//               System.out.printf("%d ",x[row][column]);
//            }
//        }
//        
//        
        
        
int[][] ragged = {{4, 3, 7},
                 {5, 2},
                 {7, 8, 1, 4}};

int sum = 0;
for (int row = 0; row < ragged.length; row++)
{
    for (int col = 0; col < ragged[row].length; col++)  // note the indexer use!
    {
        sum += ragged[row][col];
    }
}
        
     System.out.printf("Sum %d", sum);
        
        
    }
    
}
