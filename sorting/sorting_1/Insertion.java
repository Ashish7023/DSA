package sorting.sorting_1;

import java.util.*;

public class Insertion {

    public static int[] InsertionSort(int[] arr) {

        /*
         * Idea: In this algo we assume that our first element is sorted and the
         * remaining part of the array is non-sorted one and we will take one element at
         * a time
         * and check this condition (New element should always be the greater then the
         * lest element of the sorted array).
         * if yes
         * We are ready to take the next element form the un-sorted array.
         * else
         * we will set the new element to it's correct position first.
         */


        /*
        Q:Why This loop starts with 1?
        ANS: in the Idea section we are assume that the first element will always be the sorted one and the remain will be un-sorted so the next element from 
        un-sorted will be the first element. 
        */
        for (int i = 1; i < arr.length; i++) {

            //Here J represent the last element for the sorted array.
            int j = i - 1;

            /*Here the last element of the sorted array should always be lesser then the new element of the un-sorted array.

            and check this condition until that condition satisfied.
            
            */

            while (j>=0&&arr[j] > arr[i]) {
                int ele = arr[i];
                arr[i] = arr[j];
                arr[j] = ele;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many number you want to insert in array : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Start entering number the you want to insert :");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Original Array is : [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
        int[] result = InsertionSort(array);
        System.out.print("Sort Array is : [");
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.print("]");
        scan.close();
    }
}



/*
Time Complexity
   Best Case: Θ(n) //that while loop will never run if you array is sorted.

   Worst Case : Θ(n^2) //Cuz you loop will perform else and every possible cases.

   Avg Case : O(n^2) 
   
Space Complexity
    O(1)
Note: 
    Insertion Sort is Stable Sorting algo cuz it doesn't change the position of the element.(If you are not sure what is stable and non stable algo then please do check out this video {07.Sorting-01 VID:06});
*/
