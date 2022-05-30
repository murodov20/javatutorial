package Topshiriqlar;

import java.util.Scanner;

public class topshiriq36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("v1, v2, s, t ni kiriting");
        int v1 = scanner.nextInt(), v2 = scanner.nextInt(), s = scanner.nextInt(), t = scanner.nextInt();

        int umumiy = s + (v1 + v2) * t;

        System.out.println(umumiy);
    }
}
