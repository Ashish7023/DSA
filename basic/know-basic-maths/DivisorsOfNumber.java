import java.util.ArrayList;
import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                result.add(i);
            }
        }
        result.add(originalNumber);
        System.out.print("Divisor of " + originalNumber + " is : " + result);
    }

}