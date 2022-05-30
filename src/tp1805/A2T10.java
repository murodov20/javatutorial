package tp1805;

import java.util.Scanner;

public class A2T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
