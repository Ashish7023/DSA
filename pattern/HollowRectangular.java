package pattern;

import java.util.Scanner;

public class HollowRectangular {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        for (int i = 0; i < lineNumber; i++) {
            if (i == 0 || i == lineNumber - 1) {
                for (int j = 0; j < lineNumber; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < lineNumber; j++) {
                    System.out.print(j == 0 || j == lineNumber - 1 ? "*" : " ");
                }
            }
            System.out.println();
        }
    }

}
