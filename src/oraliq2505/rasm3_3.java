package oraliq2505;

import java.util.Scanner;

public class rasm3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int min = a, sum = b + c;
        if (min > b) {
            min = b;
            sum = a + c;

        }
        if (min > c) {
            sum = a + b;
        }
        System.out.println(sum);
    }
}
