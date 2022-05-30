package tp2604;

import java.util.Scanner;

public class For2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), soni = 0;

        for (int i = a; i <= b; i++) {
            soni++;
            System.out.println(i);
        }
        System.out.println("Umumiy: "  + soni);
    }
}
