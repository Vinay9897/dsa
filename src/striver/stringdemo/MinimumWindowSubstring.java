package striver.stringdemo;

import java.util.*;
// import java.util.HashMap;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String t = "ADOBECODEBANC";
        String s = "ABC";
        System.out.println(minSubstringLen(t, s));

    }

    public static int minSubstringLen(String t, String s) {
        HashMap<Character, Integer> map2 = new HashMap<>();
        // store s freq
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        int matchcount = 0;
        int desire_mc = s.length();

        HashMap<Character, Integer> map1 = new HashMap<>();
        int i = -1; // acquire pointer
        int j = -1; // release pointer
        String ans = "";
        while (true) {
            boolean flag1 = false;
            boolean flag2 = false;

            // acquire
            while (i < t.length() - 2 && matchcount < desire_mc) {
                i++;
                char ch = t.charAt(i);
                if (map1.getOrDefault(ch, 0) <= map2.getOrDefault(ch, 0)) {
                    matchcount++;
                }
                flag1 = true;
            }
            // collect answer and release
            while (j < i && matchcount == desire_mc) {
                String potentialAns = s.substring(j + 1, i + 1);
                if (ans.length() == 0 || potentialAns.length() < ans.length()) {
                    ans = potentialAns;
                }
                j++; // releasing character from starting
                char ch = t.charAt(i);
                if (map1.get(ch) == 1) {
                    map1.remove(ch);
                } else
                    map1.put(ch, map1.get(ch) - 1);

                if (map1.getOrDefault(ch, 0) < map2.getOrDefault(ch, 0)) {
                    matchcount--;
                }
                flag2 = true;
            }
            if (flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans.length();
    }

}
