import java.util.Scanner;

public class ReverseDigintInNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int originalNumber = scan.nextInt();
        int number = originalNumber;
        int reverseNumber = 0;
        while (number != 0) { 
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        System.out.println("Reverse of " + originalNumber + " is " + reverseNumber);
    }
}
