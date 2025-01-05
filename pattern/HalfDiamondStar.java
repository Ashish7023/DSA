package pattern;

import java.util.Scanner;

public class HalfDiamondStar {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        boolean isLineNumberReach = false;
        for (int i = 0; i < lineNumber * 2 - 1; i++) {
            for (int j = 0; j < (isLineNumberReach ? lineNumber - (i - lineNumber + 1) : i + 1); j++) {
                System.out.print("*");
            }
            if (i == lineNumber - 1) {
                isLineNumberReach = true;
            }
            System.out.println();
        }
    }
}
