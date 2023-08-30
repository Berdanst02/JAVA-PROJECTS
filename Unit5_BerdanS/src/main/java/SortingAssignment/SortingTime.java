/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAssignment;

import SearchAssignment.ISSStudent;
import static Sorting.BubbleSort.swap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author berd1810
 */
public class SortingTime {

    ArrayList<Integer> Arr;

    public SortingTime() {

        Arr = new ArrayList<>();

    }

    public void setData(ArrayList<Integer> inArr) {

        Arr = inArr;

    }

    public ArrayList<Integer> returnData() {
        ArrayList<Integer> arr = Arr;
        return arr;

    }

    public long insertionSort() {
        long point1;
        long point2;
        long totalTime;

        ArrayList<Integer> arr = Arr;

        point1 = System.nanoTime();
        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));

                j = j - 1;
            }

            arr.set(j + 1, key);

        }

        point2 = System.nanoTime();

        totalTime = point2 - point1;

        return totalTime;
    }

    public long selectionSort() {
        long point1;
        long point2;
        long totalTime;

        ArrayList<Integer> arr = Arr;

        int n = arr.size();
        int minValueIndex = 0;
        int tempValue;
        point1 = System.nanoTime();
        for (int i = 0; i < n; i++) {

            for (int j = i; j < arr.size(); j++) {

                if (arr.get(j) < arr.get(minValueIndex)) {
                    minValueIndex = j;
                }

            }

            tempValue = arr.get(i);
            arr.set(i, arr.get(minValueIndex));
            arr.set(minValueIndex, tempValue);
            minValueIndex = i + 1;

        }
        point2 = System.nanoTime();

        totalTime = point2 - point1;

        return totalTime;

    }

    public long bubbleSort() {
        long point1;
        long point2;
        long totalTime;

        ArrayList<Integer> arr = Arr;

        int n = arr.size();
        point1 = System.nanoTime();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr.get(j) > arr.get(j + 1)) {
                    swap(arr, j, j + 1);
                }

            }

        }

        point2 = System.nanoTime();
        totalTime = point2 - point1;

        return totalTime;

    }

    public static void swap(ArrayList<Integer> a, int x, int y) {
        int temp = a.get(x);
        a.set(x, a.get(y));
        a.set(y, temp);
    }

    public void quick(int left, int right) {

        ArrayList<Integer> arr = Arr;

        if (left >= right) { //base case
            return;
        }

        int i = left;
        int j = right;
        //int pivotValue = arr[(left+right)/2];

        int pivotValue = arr.get((left + right) / 2);

        while (i < j) {

            while (arr.get(i) < pivotValue) { //find indicies to swap
                i++;
            }

            while (arr.get(j) > pivotValue) {
                j--;
            }

            if (i <= j) { //swap if necessary
                int temp = arr.get(i);
                arr.set(i, j);
                arr.set(j, temp);
                i++;
                j--;
            }

        }

        quick(left, j);
        quick(i, right);

    }

}
