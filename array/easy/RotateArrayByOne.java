package array.easy;

import java.util.*;

public class RotateArrayByOne {

    public static void rotateByOne(int[] array) {
        int arrayFirstElement = array[0];
        for (int index = 0; index < array.length - 1; index++) {
            array[index] = array[index + 1];
        }
        array[array.length - 1] = arrayFirstElement;
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

        rotateByOne(array);

        System.out.print("The rotate array is: [ ");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        scan.close();
    }
}
