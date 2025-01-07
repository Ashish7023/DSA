package pattern;

import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + lineNumber - i + j - 1));
            }
            System.out.println();
        }
    }
}
