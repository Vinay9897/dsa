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
        String pattern = "DDDD";
        helper(pattern);
    }

    public static void helper(String pattern) {
        StringBuilder str = new StringBuilder(), helString = new StringBuilder();
        for (int i = 0; i <= pattern.length(); i++) {
            helString.append((char) ('1' + i));
            // reverse the helString only when
            // i== pattern.length()
            // or, patter[i] == 'I'
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                str.append(helString.reverse());
                // empty the helper String
                helString = new StringBuilder();
            }
        }
        System.out.println(str.toString());
    }
}