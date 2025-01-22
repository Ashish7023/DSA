import java.util.Scanner;

public class ArmStrongChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        int result = 1;
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 1);
        int digitCount = count;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (number % 10);
            number /= 10;
            for (int i = 0; i < digitCount; i++) {
                result = result * reverseNumber;
            }
        }

        System.out.print("The Number " + originalNumber + " is " +
                (reverseNumber == result ? "a ArmStrong" : "not a ArmStrong"));

    }
}
