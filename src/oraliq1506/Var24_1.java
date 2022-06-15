package oraliq1506;

import java.util.Scanner;

public class Var24_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("massiv o'lchamini kiriting:");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        //yoki
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }
}
