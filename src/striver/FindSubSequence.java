package striver;

import java.util.ArrayList;
import java.util.List;

public class FindSubSequence {
    static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = { 3, 1, 2 };
        subsequence(arr, 0, list);
        System.out.println(result);
    }

    private static void subsequence(int[] arr, int i, List<Integer> list) {

        if (i >= arr.length) {

            result.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[i]);
        subsequence(arr, i + 1, list); // take
        list.remove(list.size() - 1); // to remove the last element from the list
        subsequence(arr, i + 1, list); // not take
    }
}
