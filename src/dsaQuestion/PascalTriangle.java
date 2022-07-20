package dsaQuestion;

import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = null;
        int n = numRows;
        for (int i = 0; i < n; i++) {
            list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        int noOfRows = 5;
        System.out.println(generate(noOfRows));
    }
}
