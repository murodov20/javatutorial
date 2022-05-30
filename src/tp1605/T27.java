package tp1605;

import java.util.Scanner;

public class T27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int f;
        if (x < 0 || x >= 4) {
            f = 0;
        } else if (x >= 0 && x < 1 || x >= 2 && x < 3) {
            f = 1;
        } else {
            f = -1;
        }

        System.out.println(f);
    }
}
