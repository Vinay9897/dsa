package striver;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[arr.length];
        findPermutation(result, new ArrayList<Integer>(), arr, visited);
        System.out.println(result);
    }

    public static void findPermutation(List<List<Integer>> result, List<Integer> list, int[] arr, boolean[] visited) {
        if (list.size() == arr.length) {
            result.add(new ArrayList<>(list));
            return;
        }
        for (int index = 0; index < arr.length; index++) {
            if (!visited[index]) {
                // add in list
                list.add(arr[index]);
                // mark visited
                visited[index] = true;
                findPermutation(result, list, arr, visited);
                list.remove(list.size() - 1);
                visited[index] = false;
            }
        }
    }

}
