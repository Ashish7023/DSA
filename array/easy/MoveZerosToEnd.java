package array.easy;

import java.util.Scanner;

public class MoveZerosToEnd {

    public static void moveZeroToEnd(int[] array) {
        int currentZeroIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == 0) {
                continue;
            }
            array[currentZeroIndex] = array[index];
            if (currentZeroIndex != index) {
                array[index] = 0;
            }
            currentZeroIndex++;

        }
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

        moveZeroToEnd(array);

        System.out.print("The new array is: [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
