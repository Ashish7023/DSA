package array.easy;

import java.util.Scanner;

public class CountMaxConsecutiveOne {

    public static int consecutiveCount(int[] array) {

        int consecutiveCount = -1;
        int currentCount = 0;
        for (int index = 0; index < array.length; index++) {
   
            if (array[index] == 0 ) {
                if (currentCount > consecutiveCount) {
                    consecutiveCount = currentCount;
                }
                currentCount = 0;
                continue;
            }
            currentCount++;
        }
      
        return consecutiveCount>currentCount?consecutiveCount:currentCount;
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

        System.out.println("Maximum consecutive one count is " + consecutiveCount(array));
    }
}
