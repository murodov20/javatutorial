package tp1506;

import java.util.Scanner;

public class while1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), s = 0;

        if (a >= b) {
            System.out.println("Noto'g'ri son");
        } else {
            int i = a;
            while (i <= b) {
                s += i;
                i++;
            }
            System.out.println(s);
        }

    }
}
