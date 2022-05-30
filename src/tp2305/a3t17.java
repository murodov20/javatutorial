package tp2305;

import java.util.Scanner;

public class a3t17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 != 0 && a >= 100 && a < 1000) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
