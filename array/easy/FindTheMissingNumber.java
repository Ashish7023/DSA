package array.easy;

import java.util.Scanner;

public class FindTheMissingNumber {

    public static int findTheMissingElement(int[] array) {
        for (int index = 0; index < array.length-1; index++) {
            if (array[index] + 1 != array[index + 1]) {
                return array[index] + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers you want to insert in the array1: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the numbers:");
        for (int index = 0; index < array.length; index++) {
            array[index] = scan.nextInt();
        }

        System.out.print("The original array1 is: [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println(findTheMissingElement(array)+" is the missing number!");
        scan.close();
    }
}
