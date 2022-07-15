package striver;

import java.util.*;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = { 2, 3, 6, 7 };
        int target = 7;
        findSum(result, list, arr, target, 0);
        System.out.print(result);
    }

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
            findSum(result, list, arr, target - arr[i], i);
            list.remove(list.size() - 1);
        }
        findSum(result, list, arr, target, i + 1);
    }

}