package striver;

import java.util.ArrayList;

public class SortArray012 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 1, 0 };
        sort(arr, arr.length);
        for (int valu : arr) {
            System.out.print(valu + " ");
        }
    }

    private static void sort(int[] arr, int n) {
        int t = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 2 && arr[t] != 2) {
                swap(i, t, arr);
                t--;
            } else if (arr[i] == 2 && arr[t] == 2) {
                while (t >= 0) {

                }
            }
        }
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
