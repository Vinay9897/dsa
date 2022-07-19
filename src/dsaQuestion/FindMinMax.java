package dsaQuestion;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = { 1, 34, 74, 7, 3, 6 };
        if (arr.length == 1) {
            System.out.println("min : " + arr[0] + " " + "max : " + arr[0]);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            else if (min > arr[i])
                min = arr[i];
        }
        System.out.println("max : " + max + " " + "min : " + min);
    }
}