package pattern;

import java.util.Scanner;

class RightAngledTriangle{
    public static void main(String[] args) {
        System.out.print("Please Enter number. : ");
        Scanner read = new Scanner(System.in);
        int inputLine = read.nextInt();
        for (int i = 1; i <= inputLine; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
