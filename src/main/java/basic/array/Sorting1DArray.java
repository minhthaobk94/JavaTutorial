package basic.array;

import java.util.Arrays;
import java.util.Random;

public class Sorting1DArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(9);
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }
    }
}