package pattern;

import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int lineNumber = read.nextInt();
        boolean outerLoopBinary = true;
        boolean innerLoopBinary = false;
        for (int i = 0; i < lineNumber; i++) {
            innerLoopBinary = outerLoopBinary;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(innerLoopBinary ? "1" : "0");
                innerLoopBinary = !innerLoopBinary;
            }
            System.out.println();
            outerLoopBinary = !outerLoopBinary;
        }
    }
}
