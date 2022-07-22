package dsaQuestion;

import java.util.*;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            long n = sc.nextLong();
            if ((n & 1) == 1 || n < 4) {
                System.out.println(-1);
                return;
            } else {
                n = n / 2;
                long temp1 = n / 3;
                if ((n % 3) == 1 || (n % 3) == 2) {
                    temp1++;
                }
                long temp2 = n / 2;

                System.out.println(Math.min(temp1, temp2) + " " + Math.max(temp1, temp2));
            }

            test--;
        }
        sc.close();
    }
}
