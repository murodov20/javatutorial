package tp2604;

import java.util.Scanner;

public class For6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double narx1x = scanner.nextDouble();

        for (double i = 1.2; i <= 2; i+=0.2) {
            System.out.printf("%.2f ", i * narx1x);
        }
    }
}
