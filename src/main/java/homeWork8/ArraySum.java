package homeWork8;

import java.util.Arrays;

public class ArraySum {
    public static int[] sum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Array 1 [1,2,3,4] == " + Arrays.toString(sum(new int[]{1, 2, 3, 4})));
        System.out.println("Array 2 [1,1,1,1,1] == " + Arrays.toString(sum(new int[]{1, 1, 1, 1, 1})));
        System.out.println("Array 3 [3,1,2,10,1] == " + Arrays.toString(sum(new int[]{3, 1, 2, 10, 1})));

    }
}
