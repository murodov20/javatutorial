package tp1105;

import java.util.Scanner;

public class rasm3tp11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a != b) {
            a = a + b;
            b = a;
        } else {
            a = 0;
            b = 0;
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
