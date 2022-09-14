package dsaQuestion;

import java.util.ArrayList;
import java.util.*;

public class DialNumber {
    public static List<String> letterCombinations(String digits) {
        String[] str = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (digits.length() == 0)
            return new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder st = new StringBuilder();
        helper(digits, str, list, st, 0);
        return list;

    }

    private static void helper(String digits, String[] str, ArrayList<String> result, StringBuilder st, int index) {
        String num;
        // i become 0 after every function call
        int i = 0;
        // only if index less than digit length
        if (index < digits.length())
            i = Character.getNumericValue(digits.charAt(index));

        num = str[i];

        if (index == digits.length()) {
            result.add(st.toString());
            return;
        }

        for (int k = 0; k < num.length(); k++) {
            st.append(num.charAt(k));
            System.out.print(st.toString() + " ");
            helper(digits, str, result, st, index + 1);
            st.deleteCharAt(st.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}

// int x = Character.getNumericValue(digits.charAt(i));
// getNumbericValue---->to convert character into int
