package dsaQuestion;

// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class NegativeSubArray {

    static int count = 0;

    public static void main(String[] args) {
        int[] arr = { 1, -2, 3 };
        int index = 0;
        int sum = 0;

        System.out.println(helper(arr, index, sum));
    }

    private static int helper(int[] arr, int index, int sum) {
        if (sum < 0) {
            count++;
        }
        if (index == arr.length)
            return 0;

        for (int i = index; i < arr.length; i++) {
            // pick
            helper(arr, index + 1, sum + arr[index]);
            // unpick
            // helper(count, arr, index + 1, sum - arr[index]);
        }
        return count;
    }
}
