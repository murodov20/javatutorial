package tp2305;

import java.util.Scanner;

public class a2t18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int ac = c - a, bc = b - c;

        System.out.println(ac);
        System.out.println(bc);
        System.out.println(ac * bc);
    }
}
