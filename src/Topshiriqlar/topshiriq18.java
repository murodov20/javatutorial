package Topshiriqlar;

import java.util.Scanner;

public class topshiriq18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
