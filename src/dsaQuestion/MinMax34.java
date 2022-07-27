package dsaQuestion;

import java.util.*;

public class MinMax34 {

    // 34. Find First and Last Position of Element in Sorted Array

    /*
     * Given an array of integers nums sorted in non-decreasing order,
     * find the starting and ending position of a given target value.
     */

    // If target is not found in the array, return [-1, -1].

    // You must write an algorithm with O(log n) runtime complexity.

    public static int[] searchRange(int[] nums, int target) {
        int i = 0;
        int high = nums.length - 1;
        int[] arr = { -1, -1 };

        // search for the left side
        while (i < high) {
            int mid = i + (high - i) / 2;
            if (nums[mid] < target) {
                mid = i + 1;
            } else
                high = mid;
        }

        if (nums[i] != target) {
            return arr;
        } else
            arr[0] = i;

        // again set high = nums.length-1
        high = nums.length - 1;

        // search for the right side
        while (i < high) {
            int mid = ((high + i) / 2) + 1;
            if (nums[mid] > target) {
                high = mid - 1;
            } else
                i = mid;
        }
        arr[1] = i;
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] arr1 = searchRange(arr, target);
        System.out.println("Hello");
        System.out.println(Arrays.toString(arr1));
    }
}
