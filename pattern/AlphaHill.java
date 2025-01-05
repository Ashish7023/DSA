package pattern;

import java.util.Scanner;

public class AlphaHill {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 1; j <= lineNumber - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
}
