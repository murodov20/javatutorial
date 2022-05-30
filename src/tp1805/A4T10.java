package tp1805;

import java.util.Scanner;

public class A4T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        if (a != b) {
            a = a + b;
        } else {
            a = 0;
        }
        b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
