package tp1805;

import java.util.Scanner;

public class V4Topshiriq28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), s, p;
        int n = scanner.nextInt();

        s = 1;
        if (n > 1) {
            s = s + x / 2;
        }
        if (n > 2) {
            s = s - Math.pow(x, 3) / (2 * 4);
        }
        if (n > 3) {
            s = s + 3 * Math.pow(x, 3) / (2 * 4 * 6);
        }

        for (int i = 5; i <= n; i++) {
            p = 1;
            for (int j = 1; j <= i; j++) {
                p = p * (2 * j - 3);
            }
            s = s + Math.pow(-1, i) * p * Math.pow(x, i - 1) / (2 * 4 * 2 * i);
        }

        System.out.println(s);
    }
}
