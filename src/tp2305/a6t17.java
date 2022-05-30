package tp2305;

import java.util.Scanner;

public class a6t17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), n = scanner.nextInt(), s = 0;

        for (int i = 0; i <= n; i++) {
            s = s + (int) Math.pow(a, i);
        }

        System.out.println(s);
    }
}
