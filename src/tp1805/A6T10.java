package tp1805;

import java.util.Scanner;

public class A6T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double s = 0;

        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / i;
        }

        System.out.printf("%.1f\n", s);
    }
}
