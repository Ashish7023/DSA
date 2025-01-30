import java.util.Scanner;

public class ReverseArray {

    public static void printReverseArray(int[] array, int size) {
        if (0 == size) {
            System.out.print(array[0]);
            return;
        }
        System.out.print(array[size] + ",");
        printReverseArray(array, size - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many number you want to insert in array : ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.println("Start entering number the you want to insert :");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Original Array is : [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("]");
        System.out.print("Reverse Array is : [");
        printReverseArray(array, size - 1);
        System.out.println("]");

    }
}
