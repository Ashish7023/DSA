import java.util.Scanner;

public class ArmStrongChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        int result = 0;
        int digitCount = CountDigitInNumber.countDigit(originalNumber);
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = number % 10;
            number /= 10;
            int localResult = 1;
            for (int i = 0; i < digitCount; i++) {
                localResult = localResult * reverseNumber;
            }
            result = result + localResult;
        }

        System.out.print("The Number " + originalNumber + " is " +
                (originalNumber == result ? "a ArmStrong" : "not a ArmStrong"));

    }
}
