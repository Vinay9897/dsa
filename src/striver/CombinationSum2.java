package striver;

import java.util.*;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = { 2, 3, 5, 6, 7 };
        int target = 7;
        findSum(result, list, arr, target, 0);
        System.out.print(result);
    }

    // In this program we have to find the elements which
    // sum equal to the target but we can use each index only one time.
    private static void findSum(List<List<Integer>> result, List<Integer> list, int[] arr, int target, int i) {
        if (i >= arr.length) {
            if (target == 0) {
                result.add(new ArrayList<>(list));
                return;
            } else
                return;
        }
        if (target >= arr[i]) {
            list.add(arr[i]);
            findSum(result, list, arr, target - arr[i], i + 1);
            list.remove(list.size() - 1);
        }
        findSum(result, list, arr, target, i + 1);
    }

}
