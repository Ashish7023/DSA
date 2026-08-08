package string;

public class reverse {

    static String reverseWords(String str) {

        int startPoint = 0;

        StringBuilder resultArray = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                String reverseString = reverser(str, startPoint, i);
                resultArray.append(reverseString+" ");

                startPoint = ++i;
            }

        }
        String reverseString = reverser(str, startPoint, str.length());
        resultArray.append(reverseString+" ");
        

        return reverser(resultArray.toString(), 0, str.length());
    }

    static String reverser(String str, int start, int end) {
        StringBuilder result = new StringBuilder(str.substring(start, end));
        int right = result.length() - 1;
        int left = 0;
        char[] re = new char[result.length()];
        while (left <= right) {
            re[left] = result.charAt(right);
            re[right] = result.charAt(left);
            left++;
            right--;
        }
        return new String(re);
    }

    public static void main(String[] arg) {
        String and = reverseWords("Welcome to Ashish");
        System.out.print(and);
    }

}
