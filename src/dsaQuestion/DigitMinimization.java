package dsaQuestion;

import java.util.*;

public class DigitMinimization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            int n = sc.nextInt();
            int y = n;
            ArrayList<Integer> list = new ArrayList<>();
            while (y > 0) {
                list.add(y % 10);
                y /= 10;
            }
            Collections.reverse(list);
            while (list.size() > 1) {
                swap(list, 0, 1);
                if (list.size() > 1)
                    list.remove(list.size() - 1);
            }
            System.out.println(list);
            test--;
        }
        sc.close();
    }

    public static void swap(ArrayList<Integer> list, int i, int j) {
        Integer temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
