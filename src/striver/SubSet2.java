package striver;

import java.util.*;

// public class SubSet2 {
//     public static void main(String[] args) {
//         Set<List<Integer>> result = new HashSet<List<Integer>>();
//         List<Integer> list = new ArrayList<Integer>();
//         int[] arr = { 1, 2, 2 };
//         findSubSet(result, list, arr, 0);
//         System.out.println(result);
//     }
//  In this problem we have to find the non -repeated subsets
//     private static void findSubSet(Set<List<Integer>> result, List<Integer> list, int[] arr, int i) {
//         if (i == arr.length) {
//             result.add(new ArrayList<>(list));
//             return;
//         }

//         // take the element
//         list.add(arr[i]);
//         findSubSet(result, list, arr, i + 1);
//         list.remove(list.size() - 1);
//         findSubSet(result, list, arr, i + 1);
//     }

// }

// implementing the problem of non -repeating subset without using HashSet data structure

public class SubSet2 {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        int[] arr = { 1, 2, 2, 3 };
        findSubSet(result, list, arr, 0);
        System.out.println(result);
    }

    private static void findSubSet(List<List<Integer>> result, List<Integer> list, int[] arr, int index) {
        result.add(new ArrayList<>(list));
        for (int i = index; i < arr.length; i++) {
            if (i != index && arr[i] == arr[i - 1])
                continue;
            list.add(arr[i]);
            System.out.println(list);
            findSubSet(result, list, arr, i + 1);
            list.remove(list.size() - 1);
        }

    }
}
