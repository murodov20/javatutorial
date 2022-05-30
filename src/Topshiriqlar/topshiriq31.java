package Topshiriqlar;

import java.util.Scanner;

public class topshiriq31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Farengeytda temperaturani kiriting");
        double f = scanner.nextDouble();

        double c = (f - 32) * 5 / 9.0;

        System.out.println(c);

        // nuqtadan keyin raqam chiqarmaydi
        //System.out.printf("%.0f", c);
    }
}
