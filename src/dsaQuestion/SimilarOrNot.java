package dsaQuestion;

import java.util.*;

public class SimilarOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int test = sc.nextInt();
        // while (test > 0) {
        int sum = 0;
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int val : arr) {
            sum += val;
        }
        int sum1 = sum;
        int flag = 0;
        for (int i = 0; i < size; i++) {

            sum -= arr[i];
            float avg = sum / size - 1;

            if (arr[i] == avg) {
                flag = 1;
                System.out.println("Yes");
                break;
            }
            sum = sum1;
        }
        if (flag == 0)
            System.out.println("No");

        // test--;
        // }
    }
}
