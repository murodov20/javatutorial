package tp2305;

import java.util.Scanner;

public class a4t17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();

        if (a >= b && b >= c || a <= b && b <= c) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
