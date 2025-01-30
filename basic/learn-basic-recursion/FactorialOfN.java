import java.util.Scanner;

public class FactorialOfN {
    public static int factorialOFNNatural(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorialOFNNatural(number - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = scan.nextInt();
        System.out.print("Sum of first " + number + " natural number is :" + factorialOFNNatural(number));
    }

}
