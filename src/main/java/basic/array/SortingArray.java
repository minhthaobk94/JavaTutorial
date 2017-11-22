package basic.array;

import java.util.Arrays;
import java.util.Random;

public class SortingArray {
    public static void main(String[] args) {
        /*
        Sorting 1D array
         */
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
        System.out.println();

        /*
        Sorting 2D array
         */
        int m = 3, n = 3;
        int A [][] = new int [m][n];
        int[] arr1 = new int[m*n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            for (int j= 0; j < n; j++) {
                A[i][j] = random.nextInt(9);
                arr1[x] = A[i][j];
                x++;
            }
        }
        Arrays.sort(arr1);
        int y = 0;
        for (int i = 0; i < m; i++) {
            for (int j= 0; j < n; j++) {
                A[i][j] = arr1[y];
                y++;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}