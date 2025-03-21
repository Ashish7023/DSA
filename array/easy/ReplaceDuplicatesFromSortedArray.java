package array.easy;

import java.util.*;

public class ReplaceDuplicatesFromSortedArray {

    public static int[] removeDuplicatesFromSorted(int[] array) {
        int [] distinctArray = new int[array.length];

        // fill the distinct element
        int currentElement = Integer.MIN_VALUE;
        int distinctIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (currentElement == array[index]) {
                continue;
            }
            distinctArray[distinctIndex] = array[index];
            currentElement = array[index];
            distinctIndex++;
        }
        return distinctArray;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers you want to insert in the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the numbers:");
        for (int index = 0; index < array.length; index++) {
            array[index] = scan.nextInt();
        }

        System.out.print("The original array is: [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int result[] = removeDuplicatesFromSorted(array);

        
        System.out.print("The result array is: [");
        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scan.close();

    }
}
