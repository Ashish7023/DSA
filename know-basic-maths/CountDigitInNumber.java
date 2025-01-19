import java.util.Scanner;

public class CountDigitInNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 1);
        System.out.println(count + " digit in the number " + originalNumber);
    }
}