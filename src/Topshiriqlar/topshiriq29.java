package Topshiriqlar;

import java.util.Scanner;

public class topshiriq29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gradus kiriting: ");
        double b = scanner.nextDouble();

        // nuqtadan keyin hamma raqamlarni chiqaradi
        System.out.println(Math.toRadians(b));

        // nuqtadan keyin faqat 2ta raqam chiqaradi
        // System.out.printf("%.2f\n", Math.toRadians(b));
    }
}
