package array2305;

import java.util.Scanner;

public class Array23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n va k, l ni kiriting:");
        int n = scanner.nextInt(), k = scanner.nextInt(), l = scanner.nextInt(), sum = 0, counter = 0;
        System.out.println(n + "ta son kiriting:");
        int []massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i] = scanner.nextInt();
            // k va l-elementni ham yig'indiga kirgizamiz
            // agar kirgizmaslik kk bosa <= dagi =ni olib tashlang
            if (i <= k || l <= i) {
                sum = sum + massiv[i];
                ++counter;
            }
        }

        if (counter == 0) {
            System.out.println("O'rta arifmetikni hisoblash imkoni yoq");
        } else {
            System.out.println((double) sum / counter);
        }
    }
}
