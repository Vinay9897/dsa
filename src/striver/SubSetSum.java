package striver;

import java.util.*;

public class SubSetSum {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1 };
        int sum = 0;
        List<Integer> list = new ArrayList<>();

        findSum(list, arr, sum, 0);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void findSum(List<Integer> list, int[] arr, int sum, int index) {
        if (index >= arr.length) {
            list.add(sum);
            return;
        }
        // pick the element
        findSum(list, arr, sum + arr[index], index + 1);

        // not pick the element
        findSum(list, arr, sum, index + 1);

    }
}
