package sorting.sorting_1;

import java.util.Scanner;

public class Selection {

    public static int[] SelectionSort(int[] arr) {

        /*
            Idea: assume that we have the smallest element at the being of the array and while traverse the array and check is there
            any element is smallest out first element 
            If yes
                then perform the swap between them and continue
            else
                after traverse the whole array then move to the next one and repeat the process.
        
        */

       for(int i = 0 ; i<arr.length-1; i++){

            for(int j = i ; j<arr.length-1;j++){

                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                }

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
        
        // Taking the number and inserting inside the array.
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Original Array is : [");

        //Showing the origin array.
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");

        //Calling the selection Sort
        int[] result = SelectionSort(array);
        System.out.print("Sort Array is : [");
        
        //Print the sorted array.
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.print("]");

        scan.close();
    }
}



/*
Time Complexity
    O(n^2)
Space Complexity
    O(1)
Note: 
    Select Sort is NON-Stable Sorting algo cuz it does change the position of the element.(If you are not sure what is stable and non stable algo then please do check out this video {07.Sorting-01 VID:06});
*/
