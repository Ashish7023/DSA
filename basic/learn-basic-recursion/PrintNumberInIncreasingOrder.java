import java.util.Scanner;

public class PrintNumberInIncreasingOrder {
    public static void printNNumber(int number) {
        if (number == 1) {
            System.out.print(number + " ");
            return;
        }
        printNNumber(number - 1);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int number = scan.nextInt();
        printNNumber(number);
    }
}
