package Topshiriqlar;

import java.util.Scanner;

public class topshiriq22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();

        int raqam1 = son / 100;
        int raqam2 = (son - raqam1 * 100) / 10;
        int raqam3 = son % 10;

        if (raqam1 > raqam2 && raqam2 > raqam3 || raqam1 < raqam2 && raqam2 < raqam3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
