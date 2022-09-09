package striver;

import java.util.List;
import java.util.ArrayList;

public class PermutationUsingSwaping {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] arr = { 1, 2, 3 };
        findPermutation(result, new ArrayList<Integer>(), arr, 0);
        // System.out.println(result);
    }

    private static void findPermutation(List<List<Integer>> result, ArrayList<Integer> list, int[] arr, int index) {
        if (index == arr.length) {
            list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            result.add(list);
            System.out.println(list);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, i, index);
            findPermutation(result, list, arr, index + 1);
            swap(arr, i, index);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
