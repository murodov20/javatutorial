package tp2604;

import java.util.Scanner;

public class For8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), mult = 1;

        for (int i = a + 1; i < b; i++) {
            mult *= i;
        }
        System.out.println("Ko'paytma: "  + mult);
    }
}
