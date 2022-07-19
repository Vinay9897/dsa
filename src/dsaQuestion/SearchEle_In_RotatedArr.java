package dsaQuestion;

public class SearchEle_In_RotatedArr {
    public static int search(int[] nums, int target) {
        if (nums.length == 1)
            if (target == 0)
                return nums[0];
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // from the left to mid array is sorted
                if (nums[low] <= nums[mid] && nums[low] > target)
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (nums[high] >= nums[mid] && nums[high] < target) {
                    high = mid - 1;
                } else
                    low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 1, 3 };
        int target = 5;

        System.out.println(search(arr, target));

    }
}
