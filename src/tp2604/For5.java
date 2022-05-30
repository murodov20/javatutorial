package tp2604;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double narx1x = scanner.nextDouble();

        for (double i = 0.1; i <= 1; i+=0.1) {
            System.out.printf("%.2f ", i * narx1x);
        }
    }
}
