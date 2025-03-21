package array.easy;

import java.util.*;

import sorting.sorting_1.Bubble;

public class WhichAppearsOne {

    public static int findAppearsOne(int[] array) {
        int appearsOne = -1;
        int[] result = Bubble.BubbleSort(array);
        int count = -1;
        for (int i = 0; i < result.length; i++) {
            if (i == 0) {
                appearsOne = result[i];
                ++count;
                continue;
            }
            if (appearsOne == result[i]) {
                appearsOne = -1;
                --count;
            } else {
                appearsOne = result[i];
                ++count;
                if (count == 1) {
                    return result[i-1];
                }
                if(i==result.length-1){
                    return result[i];
                }
            }
        }
        return -1;
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
        int result = findAppearsOne(array);

        System.out.println("Element that appears one is =>" + result + "");

    }
}