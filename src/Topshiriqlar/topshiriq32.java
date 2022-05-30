package Topshiriqlar;

import java.util.Scanner;

public class topshiriq32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selsiyda temperaturani kiriting");
        double c = scanner.nextDouble();

        double f = 9 / 5.0 * c + 32;

         System.out.println(f);

        // nuqtadan keyin raqam chiqarmaydi
        // System.out.printf("%.0f", f);
    }
}
