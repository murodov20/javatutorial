package Topshiriqlar;

import java.util.Scanner;

public class topshiriq30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radianda son kiriting");
        double b = scanner.nextDouble();

        // nuqtadan keyin hamma raqamlarni chiqaradi
        System.out.println(Math.toDegrees(b));

        // nuqtadan keyin faqat 2ta raqam chiqaradi
        // System.out.printf("%.2f\n", Math.toDegrees(b));
    }
}
