package striver;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

class SubSequenceSum {
    static HashSet<List<Integer>> result = new HashSet<List<Integer>>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = { 1, 2, 3, 3 };
        int sum = 6;
        findSumValue(0, arr, list, sum);
        System.out.print(result);
    }

    private static void findSumValue(int index, int[] arr, ArrayList<Integer> list, int sum) {
        if (index >= arr.length) {
            if (sum == 0) {

                result.add(new ArrayList<Integer>(list));
            }
            return;
        }
        list.add(arr[index]);
        findSumValue(index + 1, arr, list, sum - arr[index]);
        list.remove(list.size() - 1);
        findSumValue(index + 1, arr, list, sum);
    }
}