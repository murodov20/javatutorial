package Topshiriqlar;

import java.util.Scanner;

public class topshiriq39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a va b ni kiriting");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        double
                diskriminant_sqrt = Math.sqrt(b * b - 4 * a * c),
                x1 = (-b - diskriminant_sqrt) / (2.0 * a),
                x2 = (-b + diskriminant_sqrt) / (2.0 * a);

        System.out.println(x1 + " " + x2);

    }
}
