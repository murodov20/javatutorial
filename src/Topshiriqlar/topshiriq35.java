package Topshiriqlar;

import java.util.Scanner;

public class topshiriq35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("v, u, t1 va t2 ni kiriting");
        int v = scanner.nextInt(), u = scanner.nextInt(), t1 = scanner.nextInt(), t2 = scanner.nextInt();

        // ko'ldagi masofa
        int s1 = v * t1;

        // daryodagi masofa
        int s2 = (v - u) * t2;

        // umumiy
        int s = s1 + s2;

        System.out.println(s);
    }
}
