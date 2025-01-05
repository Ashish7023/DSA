package pattern;

import java.util.Scanner;

public class DiamondStart {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();

        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < lineNumber-(i+1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1+(2*i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < lineNumber; i++) {
            for (int j = 0; j < lineNumber - (lineNumber - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (((lineNumber - i) * 2) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}