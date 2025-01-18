package pattern;

import java.util.Scanner;

public class TheNumber {
    static void printFirstHalfValue(int lineNumber, int i) {
        for (int j = 0; j < 2 * lineNumber - 1 - (2 * i); j++) {
            System.out.print(lineNumber - i);
        }
        for (int k = 0; k < i; k++) {
            System.out.print(lineNumber - i + (k + 1));
        }
    }

    static void printSecondHalfValue(int lineNumber, int i) {
        for (int j = 0; j < (2 * i) + 3; j++) {
            System.out.print(i + 2);
        }
        for (int k = 0; k < lineNumber - 2 - i; k++) {
            System.out.print(i + 2 + (k + 1));
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < 2 * lineNumber - 1; j++) {
                if (j < i) {
                    System.out.print(lineNumber - j);
                } else {
                    printFirstHalfValue(lineNumber, i);
                    break;
                }
            }
            System.out.println();
        }
        for (int i = 0; i < lineNumber - 1; i++) {
            for (int j = 0; j < 2 * lineNumber - 1; j++) {
                if (j < lineNumber - 2 - i) {
                    System.out.print(lineNumber - j);
                } else {
                    printSecondHalfValue(lineNumber, i);
                    break;
                }
            }
            System.out.println();
        }
    }
}
