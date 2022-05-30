package tp2604;

import java.util.Scanner;

public class For10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double S = 0;
        for (double i = 1; i <= n; i++) {
            S = S + 1 / i;
        }

        System.out.println(S);
    }
}
