package pattern;

import java.util.Scanner;

public class TheNumberHalf {

    static void PrintMiddleValue(int lineNumber, int i) {
        for (int j = 0; j < 2 * lineNumber - 1 - (2 * i); j++) {
            System.out.print(lineNumber - i);
        }
        for (int k = 0; k < i; k++) {
            System.out.print(lineNumber - i + (k + 1));
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
                    PrintMiddleValue(lineNumber, i);
                    break;
                }
            }
            System.out.println();
        }
       
    }
}
