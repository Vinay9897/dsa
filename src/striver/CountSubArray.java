package striver;

import java.util.List;
import java.util.ArrayList;

public class CountSubArray {

    static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = { 1, 2, 3 };
        subsequence(arr, 0, list);
        System.out.println(result);
    }

    private static void subsequence(int[] arr, int i, List<Integer> list) {
        result.add(new ArrayList<Integer>(list));
        for (int s = i; s < arr.length; s++) {
            list.add(arr[i]);
            subsequence(arr, s + 1, list); // take
            list.remove(list.size() - 1); // to remove the last element from the list
            subsequence(arr, s + 1, list);

        }
    }
}
