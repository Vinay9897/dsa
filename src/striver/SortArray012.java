package striver;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 0 };
        int maxi = Integer.MIN_VALUE;
        maxi = findMax(arr, maxi);
        sort(arr, arr.length, maxi);
        for (int val : arr) {
            System.out.print(val + " ");
        }

    }

    private static int findMax(int[] arr, int maxi) {
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    private static void sort(int[] arr, int n, int size) {
        int[] count = new int[size + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int[] sortedArray = new int[n];
        int p = 0;
        int i = 0;
        while (p < count.length) {
            if (count[p] == 0) {
                p++;
            } else {
                sortedArray[i++] = p;
                count[p]--;
            }
        }
        int j = 0;
        for (int val : sortedArray) {
            arr[j++] = val;
        }
    }
}
