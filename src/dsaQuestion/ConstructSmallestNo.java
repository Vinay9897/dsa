/*
You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.

A 0-indexed string num of length n + 1 is created using the following conditions:

num consists of the digits '1' to '9', where each digit is used at most once.
If pattern[i] == 'I', then num[i] < num[i + 1].
If pattern[i] == 'D', then num[i] > num[i + 1].
Return the lexicographically smallest possible string num that meets the conditions.
*/
package dsaQuestion;

// import java.util.*;

public class ConstructSmallestNo {
    public static void main(String[] args) {
        String pattern = "DDDD ";
        helper(pattern);
    }

    public static void helper(String pattern) {
        int i = 0;
        int s = 0;
        String str = "";
        int flag = 0;
        while (i < pattern.length() - 1) {
            if (flag == 0) {
                s = i;
            }
            flag = 1;
            // for "I"
            if (pattern.charAt(i) == 'I' && pattern.charAt(i + 1) == 'I') {

            } else {
                if (pattern.charAt(i) != 'D') {
                    for (int s1 = s + 1; s1 <= i + 1; s1++) {
                        str += s1;
                    }
                    flag = 0;
                }
            }

            // for "D"
            if (pattern.charAt(i) == 'D' && pattern.charAt(i + 1) == 'D') {

            } else {
                if (pattern.charAt(i) != 'I') {
                    for (int s1 = i + 2; s1 > s + 1; s1--) {
                        str += s1;
                    }
                    flag = 0;
                }
            }
            i++;
        }
        System.out.println(str);
    }
}