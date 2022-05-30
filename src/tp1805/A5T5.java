package tp1805;

import java.util.Scanner;

public class A5T5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double a = scanner.nextDouble(), b = scanner.nextDouble();

        if (n < 1 || n > 4 || b == 0) {
            System.out.println("noto'g'ri son");
        } else {
            switch (n) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                default:
                    System.out.println(a / b);
            }
        }
    }
}
