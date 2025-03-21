package array.easy;

import java.util.Scanner;

public class LargestNumber {

    public static int findLargest(int[] arr) {
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number you want to insert in array : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < array.length; index++) {
            array[index] = scan.nextInt();
        }
        System.out.print("the original array is : [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + ",");
        }
        System.out.println("]");
        int largestNumber = findLargest(array);
        System.out.println("larger number in array is :" + largestNumber);

    }

}
