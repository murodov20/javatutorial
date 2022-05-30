package Topshiriqlar;

import java.util.Scanner;

public class topshiriq33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x, a va y ni kiriting");
        int x = scanner.nextInt(), a = scanner.nextInt(), y = scanner.nextInt();

        System.out.println(a / x + " " + y * a / x);
    }
}
