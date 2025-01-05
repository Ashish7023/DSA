package pattern;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 1; j <= lineNumber - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + (i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}