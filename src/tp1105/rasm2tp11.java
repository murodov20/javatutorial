package tp1105;

import java.util.Scanner;

public class rasm2tp11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), s = 0;
        for (int i = 0; i<=n; i++) {
            s = s + (int) Math.pow(n + i, 3);
        }

        System.out.println(s);
    }
}
