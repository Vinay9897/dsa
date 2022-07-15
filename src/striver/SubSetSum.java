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

    // in this problem we have to print the sum of all subsets in sorted sort
    /*
     * ex: arr = {1,2,3}
     * no of possible subset ---> 2 ki power (array ki length)
     * [] = 0
     * [1] = 1
     * [2] = 2
     * [3] = 3
     * [1,2] = 3
     * [1,2,3] = 6
     * [1,3] = 4
     * [2,3] = 5
     */
    private static void findSum(List<Integer> list, int[] arr, int sum, int index) {
        // when index equal to array length store the sum in the list and return back
        // the funtion
        if (index >= arr.length) {
            list.add(sum);
            return;
        }
        // this loop for picking the element
        findSum(list, arr, sum + arr[index], index + 1);

        // this loop for not picking the element
        findSum(list, arr, sum, index + 1);

    }
}
