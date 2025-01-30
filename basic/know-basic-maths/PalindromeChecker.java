import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number that you want to check it's palindrome or not : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        int reverseNumber = 0;
        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        System.out.print("The Number " + originalNumber + " is " +
                (reverseNumber == originalNumber ? "a palindrome" : "not a palindrome"));

    }
}
