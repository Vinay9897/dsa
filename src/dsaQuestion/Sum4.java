package dsaQuestion;

import java.util.*;

public class Sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    // System.out.print(k +" ");
                    List<Integer> list = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (target == sum) { 
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        // System.out.println(list);
                        result.add(list);
                    } else if (sum > target) {
                        l--;
                    } else
                        k++;

                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        System.out.println(fourSum(arr, target));
    }

}
