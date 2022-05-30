package array2305;

import java.util.Scanner;

public class Array22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n va k, l ni kiriting:");
        int n = scanner.nextInt(), k = scanner.nextInt(), l = scanner.nextInt(), sum = 0;
        System.out.println(n + "ta son kiriting:");
        int []massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
            // k va l-elementni yig'indiga kirgizmaymiz
            if (i < k || l < i) {
                sum = sum + massiv[i];
            }
        }

        System.out.println(sum);
    }
}
