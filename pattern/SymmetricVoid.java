package pattern;

import java.util.Scanner;

public class SymmetricVoid {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < lineNumber - i; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < (2 * i); j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < lineNumber - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print('*');
            }
            for (int j = 1; j <= 2 * lineNumber - (2 + 2 * i); j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
