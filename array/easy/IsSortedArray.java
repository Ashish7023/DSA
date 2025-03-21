package array.easy;

import java.util.*;

public class IsSortedArray {
    public static boolean arraySortedChecker(int[] array) {

        for (int index = 0; index < array.length-1; index++) {
            if (!(array[index] < array[index + 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arge) {

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

        System.out.println("The above array is " + (arraySortedChecker(array) ? "fully sorted" : "not sorted"));

        scan.close();
    }
}
