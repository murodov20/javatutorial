package Topshiriqlar;

import java.util.Scanner;

public class topshiriq4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a > 2 && b <= 3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
