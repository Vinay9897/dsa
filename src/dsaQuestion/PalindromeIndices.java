package dsaQuestion;

import java.util.Scanner;

// import java.util.*;
public class PalindromeIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int min = Integer.MAX_VALUE;
            int size = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            for (int i = 0; i < size; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] != 0)
                    min = Math.min(min, freq[i]);
            }
            System.out.println(min);
            test--;
        }
        sc.close();
    }
}
