package pattern;
import java.util.Scanner;

class RectangularStartPattern {
    public static void main(String[] args) {
        System.out.println("Please Enter number.");
        Scanner read = new Scanner(System.in);
        int inputLine = read.nextInt();
        for(int i = 0; i<inputLine;i++){
            for(int j=0;j<inputLine;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
