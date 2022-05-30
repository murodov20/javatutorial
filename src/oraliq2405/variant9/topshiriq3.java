package oraliq2405.variant9;

import java.util.Scanner;

public class topshiriq3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        if (b > 0 && c > 0 || b < 0 && c < 0) {
            System.out.println(1);
        }
        if (a > 0 && c > 0 || a < 0 && c < 0) {
            System.out.println(2);
        }
        if (a > 0 && b > 0 || a < 0 && b < 0) {
            System.out.println(3);
        }
    }
}
