package tp1805;

import java.util.Scanner;

public class A6T5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double narx1x = scanner.nextDouble();

        for (double i = 0.1; i <= 1; i+=0.1) {
            System.out.printf("%.2f ", i * narx1x);
        }
    }
}
