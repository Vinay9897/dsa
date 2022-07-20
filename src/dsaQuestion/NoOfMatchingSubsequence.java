package dsaQuestion;

import java.util.Map;
import java.util.HashMap;

public class NoOfMatchingSubsequence {
    public static int numMatchingSubseq(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        // store the words array string in the HashMap
        for (String s1 : words) {
            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }

        System.out.println(map);
        // to count the string which are matching the subsequence string in words
        int count = 0;
        // convert a string s into character array[]
        char[] ch = s.toCharArray();

        // traversing the word Array string
        for (String str : map.keySet()) {
            char[] temp = str.toCharArray();
            // initialize the two pointer for string s and each string of words
            int i = 0;
            int j = 0;
            while (i < ch.length && j < temp.length) {
                if (ch[i] == temp[j]) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
            if (j == temp.length)
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        String s = "abcde";
        String[] words = { "bb", "ace", "ade", "acd" };
        System.out.println(numMatchingSubseq(s, words));

    }
}

/*
 * int slen = s.length();
 * int count =0;
 * for(String val : words)
 * {
 * int vlen = val.length();
 * // if(vlen> slen)
 * // continue;
 * int i= 0;
 * int j =0;
 * while(i<vlen && j<slen)
 * {
 * if(val.charAt(i) == s.charAt(j))
 * {
 * i++;
 * }
 * j++;
 * if(i>=val.length())
 * count++;
 * }
 * }
 * return count;
 */
