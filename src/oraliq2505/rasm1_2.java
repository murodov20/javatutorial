package oraliq2505;

import java.util.Scanner;

public class rasm1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), f;
        if (x > 0) {
            f = 2 * Math.sin(x);
        } else {
            f = 6 - x;
        }
        System.out.println(f);
    }
}
