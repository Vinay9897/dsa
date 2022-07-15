import java.util.*;

public class TheEnchantedForest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int l = 0;

            while (k-- > 0) {
                if (l == n) {
                    if (k != 0) {
                        l = 0;
                    }
                }
                sum += arr[l];
                arr[l] = 0;
                for (int j = 0; j < n; j++) {
                    arr[j] += 1;
                }
                // System.out.println(Arrays.toString(arr));
                // System.out.println("i" + i);
                l++;
                // k--;
            }
            System.out.println(sum);
            test--;
        }
        sc.close();
    }
}
