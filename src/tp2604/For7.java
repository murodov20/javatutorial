package tp2604;

import java.util.Scanner;

public class For7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), sum = 0;

        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        System.out.println("Umumiy: "  + sum);
    }
}
