package string;

import java.util.*;

public class findText {

    static void NaivePatterSearch(String str, String target) {
        for (int i = 0; i < str.length(); i++) {
            int startIndex = i;
            for (int j = 0; j < target.length() && startIndex < str.length(); j++) {
                if (str.charAt(startIndex) != target.charAt(j)) {
                    break;
                }
                startIndex++;
                if (j == target.length() - 1) {
                    System.out.print(i);
                }
            }
        }
    }

    static int getTargetHash(String target) {
        int hashValue = 0;

        for (int i = 0; i < target.length(); i++) {
            int val = (target.charAt(i) - 'a') + 1;
            hashValue += val;
        }

        return hashValue;
    }

    static int getTargetHash(String target, int startIndex, int endIndex) {
       int hashValue = 0;

        for (int i = startIndex; i <= endIndex && i<target.length(); i++) {
            int val = (target.charAt(i) - 'a') + 1;
            hashValue += val;
        }

        return hashValue;
    }



    static boolean isMatch(String str, String target,int startIndex, int endIndex) {
        int targetIndex=0;
        for (int i = startIndex; i <= endIndex; i++) {
            if(str.charAt(i)!=target.charAt(targetIndex)){
                return false;
            }
            targetIndex++;
        }
        return true;
    }

    static void RabinKarp(String str, String target){
        int targetHash = getTargetHash(target);
        for(int i =0;i<str.length();i++){
            int endIndex = i+(target.length()-1);
            int subHash = getTargetHash(str,i,endIndex);
            if(subHash==targetHash){
               if(isMatch(str,target,i,endIndex)){
                System.out.print(i);
               }
            }
        }
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        RabinKarp("abdabcbabc", "abc");

        scan.close();

    }

}
