package tp2604;

import java.util.Scanner;

public class For9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), sum = 0;

        for (int i = a; i <= b; i++) {
            sum = sum + i * i;
        }
        System.out.println("Kvadratlar yigindisi: "  + sum);

    }
}
