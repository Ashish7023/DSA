package string;

import java.util.*;

public class anagram {
    public static boolean isAnagram(String str1, String str2) {

        int arr[] = new int[26];

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 'a'] += 1;
            arr[str2.charAt(i) - 'a'] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String insfsdput = scan.next();
        System.out.println(isAnagram(input, insfsdput) ? "yes" : "No");
    }

}
