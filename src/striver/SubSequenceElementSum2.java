package striver;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceElementSum2 {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        int[] arr = { 1, 3, 2, 3 };
        int sum = 5;
        onlyFirstSubsequenceSum(result, list, arr, sum, 0);
    }

    // this program will run only till we got the first subsequence sum == sum
    private static boolean onlyFirstSubsequenceSum(List<List<Integer>> result, List<Integer> list, int[] arr, int sum,
            int index) {
        // as soon as we reach at the end of the array
        // we will check sum == 0 and print the list and return true; to stop the loop

        if (index == arr.length) {
            if (sum == 0) {
                result.add(new ArrayList<Integer>(list));
                System.out.print(result);
                return true;
            }
            // if sum not equal to 0 we return false because to check further elements sum
            return false;
        }

        list.add(arr[index]);
        // pick or take
        if (onlyFirstSubsequenceSum(result, list, arr, sum - arr[index], index + 1) == true)
            return true;

        list.remove(list.size() - 1);

        // not pick or not-take

        if (onlyFirstSubsequenceSum(result, list, arr, sum, index + 1) == true)
            return true;

        return false;
    }
}
