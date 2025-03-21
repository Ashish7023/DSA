package array.easy;

import java.util.Scanner;

class SecondSmallLarge {
    private int secondMin = Integer.MIN_VALUE;
    private int secondMax = Integer.MAX_VALUE;

    public int getSecondMin() {
        return secondMin;
    }

    public int getSecondMax() {
        return secondMax;
    }

    public void setSecondMin(int min) {
        this.secondMin = min;
    }

    public void setSecondMax(int max) {
        this.secondMax = max;
    }
}

public class SecondSmallSecondLarge {

    public static int findSecondMin(int[] arr) {
        if (arr.length <= 1)
            return -1;
        int smallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
        }
        int secondSmallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondSmallestNumber && arr[i] != smallestNumber) {
                secondSmallestNumber = arr[i];
            }
        }
        return secondSmallestNumber;
    }

    public static int findSecondMax(int[] arr) {
        if (arr.length <= 1)
            return -1;
        int largestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }
        int secondLargestNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargestNumber && arr[i] != largestNumber) {
                secondLargestNumber = arr[i];
            }
        }
        return secondLargestNumber;
    }

    public static void main(String[] args) {
        SecondSmallLarge second = new SecondSmallLarge();
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

        second.setSecondMax(findSecondMax(array));
        second.setSecondMin(findSecondMin(array));

        System.out.println("Second min number is: " + second.getSecondMin());
        System.out.println("Second max number is: " + second.getSecondMax());

        scan.close();
    }
}
