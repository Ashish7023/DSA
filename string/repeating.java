package string;

import java.util.*;

public class repeating {

    static int leftMost(String str) {

        int res = Integer.MAX_VALUE;

        int[] arr = new int[26];

        for (int i = str.length() - 1; i >= 0; i--) {
            if (arr[str.charAt(i) - 'a'] == 0) {
                arr[str.charAt(i) - 'a'] = 1;
            } else {
                if (i < res) {
                    res = i;
                }
            }

        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println(leftMostNonRepeating(input));
    }

    static public int leftMostNonRepeating(String str) {
        char[] list = new char[26];

        for (int i = 0; i < str.length(); i++) {
            list[str.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (list[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}
