import java.util.Scanner;

public class CountDigitInNumber {

    public static int countDigit(int number) {
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number != 0);
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int originalNumber = scan.nextInt();

        int digitCount = countDigit(originalNumber);
        System.out.println("The number " + originalNumber + " has " + digitCount + " digits.");
    }
}
