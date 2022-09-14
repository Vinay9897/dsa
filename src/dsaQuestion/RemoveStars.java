package dsaQuestion;

public class RemoveStars {
    // Remove Star from the string previous character
    // suppose * at i and remove with i-1 character also
    public static void main(String[] args) {
        String s = "erase*****";
        System.out.println(removeStars(s));

    }

    private static String removeStars(String s) {
        if (s.length() == 1 && s.charAt(0) == '*')
            return "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '*') {
                s = s.substring(0, i - 1) + s.substring(i + 1, s.length());

                i--;
            } else
                i++;
        }
        // if (s.length() == 2 && s.charAt(1) == '*') {
        // return "";
        // }
        return s;
    }
}