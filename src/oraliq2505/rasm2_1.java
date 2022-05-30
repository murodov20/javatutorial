package oraliq2505;

import java.util.Scanner;

public class rasm2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 3) - 7;

        System.out.println(y);
    }
}
