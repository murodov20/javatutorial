package array2305;

import java.util.Scanner;

public class Array26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n ni kiriting:");
        int n = scanner.nextInt(), index = 0;
        boolean found = false, isJuft = false;

        System.out.println(n + "ta son kiriting:");
        int []massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
            if (i != 0 && !found) {
                if (isJuft && massiv[i] % 2 == 0 || !isJuft && massiv[i] % 2 != 0) {
                    found = true;
                    index = i;
                }
            }

            isJuft = massiv[i] % 2 == 0;
        }

        System.out.println(index);
    }
}
