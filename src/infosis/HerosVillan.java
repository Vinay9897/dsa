package infosis;

import java.util.Arrays;

public class HerosVillan {
    public static void main(String[] args) {
        int[] heros = { 3, 3, 3 };
        int[] villian = { 1, 4, 2, 4, 3 };
        Arrays.sort(villian);
        int remainVillian = 0;
        int i = 0;
        int j = 0;
        while (i < villian.length && j < heros.length) {

            if (heros[j] > villian[i]) {
                heros[j] -= villian[i];
                i++;
                if (i >= villian.length || j >= heros.length) {
                    break;
                }
            } else if (heros[j] < villian[i]) {
                remainVillian = villian.length - i;
                j++;
                if (j >= heros.length || i >= villian.length) {
                    break;
                }
            } else {
                remainVillian = villian.length - i;
                j++;
                i++;
                if (j >= heros.length || i >= villian.length) {
                    break;
                }

            }
        }
        System.out.println("No of villian :" + remainVillian);
    }

}
