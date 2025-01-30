import java.util.Scanner;

public class Fibonacci {

    public static int calculateFibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }

    public static void printFibonacciSequence(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(calculateFibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = scan.nextInt();
        System.out.println("Fibonacci Sequence:");
        printFibonacciSequence(number);
    }
}
