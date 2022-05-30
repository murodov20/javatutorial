package tp2604;

import java.util.Scanner;

public class For3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), soni = 0;

        for (int i = b; i >= a; i--) {
            soni++;
            System.out.println(i);
        }
        System.out.println("Umumiy: "  + soni);
    }
}
