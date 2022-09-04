package infosis;

import java.util.*;

public class Solution1 {
    public static boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, i - map.get(ch) - 1);
                // System.out.println(ch + " " + map.get(ch));
            } else
                map.put(ch, i);
        }
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        for (char ch : set) {
            System.out.println(ch + " " + map.get(ch) + " " + distance[ch - 'a']);
            if (map.get(ch) != distance[ch - 'a']) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance = { 1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        System.out.println(checkDistances(s, distance));
    }
}
