import java.util.Scanner;

public class PrintNumberInDecreasingOrder {

    public static void printNNumber(int number) {
        System.out.print(number + " ");
        if (number == 1) {
            return;
        }
        printNNumber(number - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = scan.nextInt();
        printNNumber(number);
    }
}
