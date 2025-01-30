import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String str, int start, int end) {

        if (str.charAt(start) == str.charAt(end)) {
            if (start == end || end < start) {
                return true;
            } else {
                return checkPalindrome(str, ++start, --end);
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string the you want to check it palindrome or not : ");
        String str = scan.nextLine();
        System.out.print(
                "String " + str + " is "
                        + (checkPalindrome(str, 0, str.length() - 1) ? "Palindrome" : "not Palindrome"));

    }
}
