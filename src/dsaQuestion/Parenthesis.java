package dsaQuestion;

import java.util.*;

public class Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<String>();
        // StringBuilder sb = new StringBuilder();
        String sb = "";
        parenthesisFunction(n, list, 0, 0, sb);
        System.out.println(list);
    }

    public static void parenthesisFunction(int n, List<String> list, int open, int close, String sb) {
        if (sb.length() == (2 * n)) {
            list.add(sb);
            return;
        }
        if (open < n) {
            parenthesisFunction(n, list, open + 1, close, sb + "(");
        }
        if (close < open) {
            parenthesisFunction(n, list, open, close + 1, sb + ")");
        }
    }

}
