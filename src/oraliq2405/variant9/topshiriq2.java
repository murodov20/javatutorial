package oraliq2405.variant9;

import java.util.Scanner;

public class topshiriq2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1 = scanner.nextDouble(), v2 = scanner.nextDouble(), s = scanner.nextDouble(), t = scanner.nextDouble();

        double yuriladi = t * (v1 + v2);

        System.out.println(Math.abs(s - yuriladi));
    }
}
