package dsaQuestion;

import java.util.*;

class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Character> st = new Stack<Character>();
            int flag = 1;
            String t = sc.next();

            // if (t.length() % 2 != 0) {
            // System.out.println("false");
            // continue;
            // }
            char[] input = t.toCharArray();
            int i = 0;
            while (i < input.length) {
                if ((input[i] == '{') || (input[i] == '(') || (input[i] == '[')) {
                    st.push(input[i]);
                } else if (input[i] == ')' && st.peek() == '(') {
                    st.pop();
                } else if (input[i] == '}' && st.peek() == '{') {
                    st.pop();
                } else if (input[i] == ']' && st.peek() == '[') {
                    st.pop();
                } else {
                    flag = 0;
                    break;
                }
                i++;
            }
            if (flag == 1 && st.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");

        }
        sc.close();
    }
}
