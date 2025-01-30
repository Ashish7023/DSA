import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinMaxFrequency {
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

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        int minElement = -1;
        int maxElement = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int frequency = entry.getValue();
            if (frequency < minFrequency) {
                minFrequency = frequency;
                minElement = key;
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = key;
            }
        }
        System.out.println("Element with Minimum Frequency: " + minElement + " Frequency: => " + minFrequency);
        System.out.println("Element with Maximum Frequency: " + maxElement + " Frequency: => " + maxFrequency);
    }
}
