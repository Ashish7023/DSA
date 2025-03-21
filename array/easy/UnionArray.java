package array.easy;

import java.util.Scanner;

public class UnionArray {

    public static int[] union(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        int array1Index = 0, array2Index = 0, resultIndex = 0;
        int lastElement = Integer.MIN_VALUE;

        while (array1Index < array1.length && array2Index < array2.length) {
            if (array1[array1Index] < array2[array2Index]) {
                if (array1[array1Index] != lastElement) {
                    result[resultIndex++] = array1[array1Index];
                    lastElement = array1[array1Index];
                }
                array1Index++;
            } else if (array1[array1Index] > array2[array2Index]) {
                if (array2[array2Index] != lastElement) {
                    result[resultIndex++] = array2[array2Index];
                    lastElement = array2[array2Index];
                }
                array2Index++;
            } else if (array1[array1Index] == array2[array2Index]) {
                if (array1[array1Index] != lastElement) {
                    result[resultIndex++] = array1[array1Index];
                    lastElement = array1[array1Index];
                }
                array1Index++;
                array2Index++;
            }
        }
        while (array2Index < array2.length) {
            result[resultIndex] = array2[array2Index];
            array2Index++;
            resultIndex++;
        }
        while (array1Index < array1.length) {
            result[resultIndex] = array1[array1Index];
            array1Index++;
            resultIndex++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers you want to insert in the array1: ");
        int size = scan.nextInt();
        int[] array1 = new int[size];

        System.out.println("Enter the numbers:");
        for (int index = 0; index < array1.length; index++) {
            array1[index] = scan.nextInt();
        }

        System.out.print("The original array1 is: [");
        for (int index = 0; index < array1.length; index++) {
            System.out.print(array1[index]);
            if (index < array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("How many numbers you want to insert in the array2: ");
        int size2 = scan.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the numbers:");
        for (int index = 0; index < array2.length; index++) {
            array2[index] = scan.nextInt();
        }

        System.out.print("The original array2 is: [");
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array1[index]);
            if (index < array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] unionArray = union(array1, array2);

        System.out.print("The union Array is: [");
        for (int index = 0; index < unionArray.length; index++) {
            if (unionArray[index] != 0) {
                System.out.print(unionArray[index]);
            }
            if (index < unionArray.length - 1 && unionArray[index] != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
