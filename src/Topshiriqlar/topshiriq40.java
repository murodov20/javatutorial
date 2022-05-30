package Topshiriqlar;

import java.util.Scanner;

public class topshiriq40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a1, b1, c1, a2, b2 va c2 ni kiriting");
        double a1 = scanner.nextDouble(), b1 = scanner.nextDouble(), c1 = scanner.nextDouble();
        double a2 = scanner.nextDouble(), b2 = scanner.nextDouble(), c2 = scanner.nextDouble();

        // yechish uchun:
        // x = (c1 - b1 * y) / a1 ni ikkinchi tenglamaga qo'yib y ni topamiz. keyin x ni
        // a2 * (c1 - b1 * y) / a1 + b2 * y = c2
        // a2 * c1 - b1 * y + a1 * b2 * y = c2 * a1
        // y = (c2 * a1 - a2 * c1) / (a1 * b2 - b1)

        double
                y = (c2 * a1 - a2 * c1) / (a1 * b2 - b1),
                x = (c1 - b1 * y) / a1;

        System.out.println(x + " " + y);

    }
}
