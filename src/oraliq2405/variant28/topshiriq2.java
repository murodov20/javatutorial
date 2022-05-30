package oraliq2405.variant28;

import java.util.Scanner;

public class topshiriq2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        double katet1, katet2, gip;
        if (a > b) {
            if (c > a) {
                gip = c;
                katet1 = a;
                katet2 = b;
            } else {
                gip = a;
                katet1 = c;
                katet2 = b;
            }
        } else {
            if (c > b) {
                gip = c;
                katet1 = a;
                katet2 = b;
            } else {
                gip = b;
                katet1 = a;
                katet2 = c;
            }
        }

        if (katet1 * katet1 + katet2 * katet2 == gip * gip) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
