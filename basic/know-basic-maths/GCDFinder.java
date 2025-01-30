import java.util.Scanner;

public class GCDFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number first number : ");
        int firstOriginalNumber = scan.nextInt();
        int firstNumber = firstOriginalNumber;
        System.out.print("Enter the number second number : ");
        int secondOriginalNumber = scan.nextInt();
        int secondNumber = secondOriginalNumber;
        int result = 1;
        for (int i = (firstNumber < secondNumber ? firstNumber : secondNumber); 0 < i; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                result = i;
                break;
            }
        }
        System.out.print(
                "Number " + firstOriginalNumber + " and Number " + secondOriginalNumber + "has GCD is :" + result);

    }
}
