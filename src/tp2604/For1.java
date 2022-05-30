package tp2604;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(), n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("N 0dan kichik");
        }
        for (int i = 0; i < n; i++) {
            System.out.println(k);
        }
    }
}
