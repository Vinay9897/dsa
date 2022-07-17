package infosis;

public class HerosVillan {
    public static void main(String[] args) {
        int[] heros = { 3, 3, 3 };
        int[] villian = { 4, 4, 4, 4 };
        int remainVillian = 0;
        int i = 0;
        int j = 0;
        while (heros.length > 0) {

            while (i < villian.length) {

                if (heros[j] > villian[i]) {
                    heros[j] -= villian[i];
                    i++;
                    if (i >= villian.length) {
                        break;
                    }
                } else if (heros[j] < villian[i]) {
                    remainVillian = villian.length - i;
                    j++;
                    if (j >= heros.length) {
                        break;
                    }
                    if (i >= villian.length) {
                        break;
                    }
                } else {
                    j++;
                    i++;
                    remainVillian = villian.length - i - 1;
                    if (j >= heros.length) {
                        break;
                    }
                    if (i >= villian.length) {
                        break;
                    }

                }
            }
            System.out.println("No of villian :" + remainVillian);
        }
    }

}
