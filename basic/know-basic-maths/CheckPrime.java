import java.util.ArrayList;
import java.util.Scanner;

public class CheckPrime {
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
        System.out.print(originalNumber + " is a " + (result.size() == 1 ? "prime" : "not prime"));
    }
}
