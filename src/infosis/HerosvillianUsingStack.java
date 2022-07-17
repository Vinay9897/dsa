package infosis;

import java.util.Stack;
import java.util.Arrays;

public class HerosvillianUsingStack {
    public static void main(String[] args) {
        int[] heros = { 3, 3, 3, 3 };
        int[] villian = { 2, 2, 2 };
        Arrays.sort(villian);
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for (int val : heros) {
            st1.push(val);
        }
        for (int i = villian.length - 1; i >= 0; i--)
            st2.push(villian[i]);

        while (!st1.isEmpty() && !st2.isEmpty()) {
            int hero = st1.peek();
            int villo = st2.peek();
            if (hero > villo) {
                st1.pop();
                st1.push(hero - villo);
                st2.pop();
            } else if (hero < villo) {
                st1.pop();
            } else {
                st1.pop();
                st2.pop();
            }
        }
        System.out.println("No of villan :" + st2.size());
        System.out.println("No of hero :" + st1.size());
    }
}
