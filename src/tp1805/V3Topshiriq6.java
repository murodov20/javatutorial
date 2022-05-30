package tp1805;

import java.util.Scanner;

public class V3Topshiriq6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
        double v = a * b * c, s = 2* (a * b + b * c + a * c);
        System.out.printf("hajmi: %.2f\n", v);
        System.out.printf("sirt yuzi: %.2f\n", s);
    }
}
