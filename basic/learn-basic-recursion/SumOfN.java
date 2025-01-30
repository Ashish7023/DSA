import java.util.Scanner;

public class SumOfN {
    public static int SumOFNNatural(int number) {
        if (number == 1) {
            return 1;
        }
        return number + SumOFNNatural(number - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = scan.nextInt();
        System.out.print("Sum of first " + number + " natural number is :" + SumOFNNatural(number));
    }
}
