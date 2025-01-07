package pattern;

import java.util.Scanner;

public class TheNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 0; i < 2 * lineNumber - 1; i++) {
            for (int j = 0; j < 2 * lineNumber - 1; j++) {
                if (j <= i) {
                    System.out.print(lineNumber - j + " ");
                } else if (j == (2 * lineNumber - 2)) {
                    System.out.print(lineNumber + " ");
                } else {
                    System.out.print(lineNumber - i + " ");
                }
            }
            System.out.println();
        }
    }
}
