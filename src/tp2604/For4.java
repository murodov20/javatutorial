package tp2604;

import java.util.Scanner;

public class For4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double narx1x = scanner.nextDouble();

        for (double i = 1; i <= 10; i++) {
            System.out.printf("%.2f ", i * narx1x);
        }
    }
}
