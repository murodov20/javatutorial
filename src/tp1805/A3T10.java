package tp1805;

import java.util.Scanner;

public class A3T10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a % 2 == 0 && b % 2 == 0 || a % 2 != 0 && b % 2 != 0) {
            // ikkalasiyam juft yoki juft
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
