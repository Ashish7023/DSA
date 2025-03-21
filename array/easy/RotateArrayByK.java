package array.easy;
import java.util.*;

public class RotateArrayByK {
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
        System.out.print("How many time you want to rotate this array :");

        int rotationCount = scan.nextInt();

        for (int index = 0; index < rotationCount; index++) {
            RotateArrayByOne.rotateByOne(array);
        }

        System.out.print("The rotated array is: [");
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scan.close();
    }
}
