package Topshiriqlar;

import java.util.Scanner;

public class topshiriq22_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        int s1 = son / 100;
        int s2 = (son - s1 * 100) / 10;
        int s3 = son % 10;

        if (s1 > s2 && s2 > s3 || s1 < s2 && s2 < s3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
