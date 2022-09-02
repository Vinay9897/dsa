package striver.stringdemo;

// 
public class padlindromic {

    public static boolean checkPal(int i, int j, String str) {

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        // int maxLen = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int p = i; p < n; p++) {
                if (checkPal(i, p, s) == true) {
                    sum++;
                }
            }
            // maxLen = Math.max(maxLen, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "abba";
        // countSubstrings(s);
        System.out.println(countSubstrings(s));
    }
}
